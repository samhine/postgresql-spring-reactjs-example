# postgreSQL-react-reactjs-example
A little example of the tech stack we might be using


# Setting up ~~MySQL~~ postgreSQL
This page https://www.codementor.io/engineerapart/getting-started-with-postgresql-on-mac-osx-are8jcopb gives a nice tutorial to creating a postgreSQL service locally, as well as a user and database.

Follow the tut closely, but you need a user to be called "springuser" and a database to be called "db_example" in order to properly interact with the spring service. If you choose to use a different username and database name, you can change the settings within `src/main/resources/application.properties`. 

# Importing into Intellij
Within each of the front-end and back-end folder, *Open* the folder (from Intellij) which contains the `.idea` folder. You can view hidden folders on MacOS by using `CMD+SHIFT+.` . Please note, for the back-end you're required to open `back-end/complete` rather than the `back-end` folder as a whole.

# Deployment to AWS
First of all, the spring project needs to be built using Maven. This can (somehow) be done using Intellij, but I chose to install Maven to the command line using `brew install mvn`, which then allows you to run `mvn clean package -DskipTests` within the `complete` directory. This produces a `.jar` file within `/target`, which should be copied to the AWS instance. 

A similar process should be done for the front-end, but the raw files can be copied and built on the server.

Next, user groups should be modified for the EC2 instance, mainly, ports 5000 and 8080 should be open for HTTP access from all IPs. 

On the server, the same steps should be taken to create the required users and databases for the Spring application to use. And all dependencies installed (mainly `node`). 

You can start the front-end using `npm start` or serve a built version (https://create-react-app.dev/docs/deployment) - either way, the front-end will be accessible at port 5000 on the server. The server needs to be ran in unison with the front-end, and is run using `java -jar /path/to/build.jar`. One the front-end, and back-end are running successfully on the EC2 instance, and the user groups have been properly defined, the application should be availible at something that looks like `ec2-#-###-###-###.us-east-2.compute.amazonaws.com` (link can be found under `Public DNS (IPv4)` within the EC2 management console for your instance).
