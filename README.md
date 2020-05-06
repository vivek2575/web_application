

# Basic Overview
A simple, but at the same time powerful secure login and signup system, which mixes a lot of microservices together and make a unique choice to adopt it. In addition, it comes along with the latest Spring framework Techonologies. Furthemore, this example is composed by a combination of  Spring Boot 1.5.6,Spring Security, Mysql,Hibernate and JPA,  Bootstrap 3 for the form design as well as jQuery for event handling.


## For database
use dummy.sql file for database.
run the command where this file is.
$ mysql -u root -p databasename < dummy.sql 


##Build and Deploy
___
```
$ cd ~\login_signup
$ mvn clean install
```

This is a Spring Boot project, so you can deploy it by simply using the main class: ```Application.java``` 

$ cd (Your Path here)\login_signup\target\
$ java -jar original-Spring-Full-Security-1.0-SNAPSHOT.war
```

If everything is working properly you will able to open the 
https://127.0.0.1:8443/

you will automatically be redirected  in the Loginpage




