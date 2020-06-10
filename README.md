# J2EE - Spring Boot,Spring Security, Spring Socket, Angular
This is simple stock price Application using Spring Boot, Spring Security, Angular 4
to write the initial code and apply socket programming to communicate between client and server

# Technology Analyse
To choose socket programming because of the following reasons:
Establish 1 time to avoid connectivity overhead
Up to date with minimum latency if any changes in the backend or frontend 

The system is designed by client orientation. For each 1 seconds the client sends the signal through the socket and the server responses immediately

Another approach we can apply by using server orientation. Whenever the server receives the updated signal from Reuters it will send the changed data and the client is designed by Observer pattern to receive and render the changed data.

# Technologies uses:
 -- Java (1.8), J2EE
 -- Spring Boot
 -- Spring Socket
 -- Spring Security
 -- Spring Annotation
 -- JPA
 -- Rest-API
 -- Angular 4
 -- Mockito, Unit for Java test
 -- Karma for Angular test 
 
# Run Process with command lines: 
 -- mvn clean install 
 -- mvn spring-boot:run
 -- Run the Angular App with command: npm start
 -- Open browser for url http://localhost:4200/
