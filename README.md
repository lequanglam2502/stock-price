# J2EE - Spring Boot, Spring Security, Spring Socket, Angular
This is simple stock price Application using Spring Boot, Spring Security, Angular 4
to write the initial code and apply socket programming to communicate between client and server

# Technology Analysing
To choose socket programming because of the following reasons:
Establish 1 time to avoid connectivity overhead
Up to date with minimum latency if any changes in the backend or frontend 

The system is designed by client orientation. For each 1 seconds the client sends the signal through the socket and the server responses immediately

Another approach we can apply by using server orientation. Whenever the server receives the updated signal from Reuters it will send the changed data and the client is designed by Observer pattern to receive and render the changed data.

# Technology Applying
 -- Java (1.8), J2EE
 -- Spring Boot
 -- Spring Socket
 -- Spring Security
 -- Spring MVC
 -- Angular 4
 -- Mockito, Unit, Jacoco for Java test
 -- Karma, Jasmine, Istanbul for Angular test 
 
# Run Process with Command Lines
 -- mvn clean install 
 -- mvn spring-boot:run
 -- Run the Angular App with command: npm start
 -- Open browser for url http://localhost:4200/

# Angular4 Client Test
This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 1.7.1.

## Development Server
Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code Scaffolding
Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build
Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `-prod` flag for a production build.

## Running Unit Tests
Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end Tests
Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

## Further Help
To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).
