# bookmymovie
 
This project is the clone of bookMyshow.
The project has developed using Microservice architecture.
 
 
# Microservices
 
The different microservices are
* Config-server - To add the functionality of centralised configuration
* eureka-server - To register and mapping of the request when there is more than one instance of microservice.
* Customer-manager - To manage the login,registration and other services for the customer.
* Payment-service - This handles the payment request while booking any movie.
 
# Databases
* For all the microservices,the Postgres database has been used.
 
 
# configuration -
add the centralised configuration repository path in  <br>
config-server/src/main/resources/application.properties
<br>example: <br>
spring.cloud.config.server.git.uri= https://github.com/mygitpath/
 

