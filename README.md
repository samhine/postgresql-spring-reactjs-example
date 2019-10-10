# mysql-react-reactjs-example
A little example of the tech stack we might be using


# Setting up MySQL

Download and install the MySQL server from here: https://dev.mysql.com/downloads/mysql/

Once downloaded, you might need to add the binaries to your path (so you can access mysql from the command line), if you have the default installation, then you can do this through typing `export PATH=${PATH}:/usr/local/mysql/bin`, and type `mysql` to verify you can access its prompt.

Within the `mysql` prompt type the following;
```
mysql> create database db_example;
mysql> create user 'springuser'@'%' identified by 'ThePassword';
mysql> grant all on db_example.* to 'springuser'@'%';
```
This gives creates the credentials which are defined within the backend (`src/main/resources`) if you're interested.

# Importing into Intellij
Within each of the front-end and back-end folder, *Open* the folder (from Intellij) which contains the `.idea` folder. You can view hidden folders on MacOS by using CMD+SHIFT+.
