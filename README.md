# README #

### What is this repository for? ###

* Demo Spring Boot app for pushing Spring Actuator metrics into AWS CloudWatch.


### How do I get set up? ###

* Build with maven
mvn package

* Run the jar in **dev** mode
java  -Dspring.profiles.active=dev -Daws.accessKeyId=<> -Daws.secretKey=<>  -jar target/cirrus-spring-actuator-to-cloudwatch-demo-1.0-SNAPSHOT.jar


### Curl Requests ###

* curl -X GET 'http://localhost:8080/hello' -> Hello world API
