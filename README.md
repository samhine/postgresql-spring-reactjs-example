# mysql-react-reactjs-example
A little example of the tech stack we might be using


# Setting up ~~MySQL~~ postgreSQL
This page https://www.codementor.io/engineerapart/getting-started-with-postgresql-on-mac-osx-are8jcopb gives a nice tutorial to creating a postgreSQL service locally, as well as a user and database.

Follow the tut closely, but you need a user to be called "springuser" and a database to be called "db_example" in order to properly interact with the spring service. If you choose to use a different username and database name, you can change the settings within `src/main/resources/application.properties`. 

# Importing into Intellij
Within each of the front-end and back-end folder, *Open* the folder (from Intellij) which contains the `.idea` folder. You can view hidden folders on MacOS by using `CMD+SHIFT+.` . Please note, for the back-end you're required to open `back-end/complete` rather than the `back-end` folder as a whole.

