# eureka-service-discovery
This is a mini implementation of Netflix Eureka server it has tree services as modules the principal is the eureka discoveri server and two microservices
that are registered to the discovery server, they have a simple request and one microservice call the other trough the discovery server

1. Clone the project
2. Open with your favourite IDE, I preffer IntelliJ Idea
3. run first the service discovery server
4. then run the other two microservices
5 make a call to localhost:8082/api/v1/greetings and you get the greeting
6. if you want to test the error handling do not start hello microservice and make the call you will get an error response 
