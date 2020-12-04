# Spring Boot Starter Kit

- Spring Boot v2.3.6
- Swagger v3

## How to build

`mvn clean install -U` || `mvn clean install -U -DskipTests`

## Run microservice

`mvn spring-boot:run`

### Choose spring profiles

For Develop

`mvn spring-boot:run -Dspring.profiles.active=dev`

For Production

`mvn spring-boot:run -Dspring.profiles.active=prod`

## Swagger page

**http://localhost:8080/swagger-ui/index.html**

