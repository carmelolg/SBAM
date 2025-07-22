# SBAM - Spring Boot Architecture for Microservices

![logo](https://i.ibb.co/VWHWRJxv/logo-design.png "SBAM Logo")

A starter template for Spring Boot applications, designed to quickly kickstart the development of microservices with a ready-to-use configuration.

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)
[![Coverage](.github/badges/jacoco.svg)](.github/badges/jacoco.svg)
[![Branches](.github/badges/branches.svg)](.github/badges/branches.svg)

## Key Technologies

- **Spring Boot**: v3.5.3
- **OpenAPI**: v3.0.1 (for API documentation)
- **Maven**: for dependency management and build
- **Docker**: for containerization

---

## Getting Started

### Prerequisites

Make sure you have the following tools installed:

- **JDK**: Version 21 or higher
- **Maven**: Version 3.9.7 or higher
- **Docker** (optional): for running in containers
- **Git**: for cloning the repository

### Clone the Repository

Clone the Git repository to your local machine:

```bash
git clone https://github.com/carmelolg/spring-boot-microservice-template.git
cd spring-boot-microservice-template
```

## Building the Project

To build the project, use the following Maven command:
```bash
mvn clean install -U
```

If you want to skip tests during the build, run:
```bash
mvn clean install -U -DskipTests
```

## Running the Microservice

You can start the microservice using Maven:

```bash
mvn spring-boot:run
```

## Spring Profiles

The project supports Spring profiles for different configurations. 
You can specify the profile to use with the -Dspring.profiles.active parameter:

For development (dev):
```bash
mvn spring-boot:run -Dspring.profiles.active=dev
```

For production (prod):
```bash
    mvn spring-boot:run -Dspring.profiles.active=prod
```

## API Documentation

The APIs are documented with Swagger. Once the microservice is running, you can access the API documentation at the following URL:

http://localhost:8080/swagger-ui/index.html

## Using Docker

You can containerize the project using the included Dockerfiles. 
This repository provides two Dockerfiles:

- Dockerfile (for standard JVM image)
- Dockerfile.native (for GraalVM Native image)

>Note: Building a GraalVM native image requires the GraalVM Native Image tool and may take additional time/resources.

1. **Build the Docker Image** (JVM):

```bash
# Build the Docker image (JVM)
docker build -t sbam -f Dockerfile .
# Run the container
docker run -p 8080:8080 sbam
```
2. **Build the Docker Image** (GraalVM Native):

```bash 
# Build the Docker image (Native)
docker build -t sbam-native -f Dockerfile.native .
# Run the container
docker run -p 8080:8080 sbam-native
```

The application will now be accessible at http://localhost:8080.

## Project Structure

This project follows the CLEAN architecture principles, ensuring a clear separation of concerns and maintainability. The code is organized into layers, with each layer having its own responsibilities.

The main structure of the project is as follows:

```crmsh
sbam/
├── docs/
│   └── architecture.drawio
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── it/
│   │   │       └── carmelolagamba/
│   │   │           └── sbam/
│   │   │               ├── adapters/
│   │   │               │   ├── command/
│   │   │               │   ├── dto/
│   │   │               │   │   └── mapper/
│   │   │               │   ├── outbound/
│   │   │               │   │   ├── api/
│   │   │               │   │   │   └── v1/
│   │   │               │   │   └── consumer/
│   │   │               │   └── resource/
│   │   │               │       └── assembler/
│   │   │               ├── common/
│   │   │               │   ├── config/
│   │   │               │   ├── security/
│   │   │               │   └── utils/
│   │   │               ├── core/
│   │   │               │   ├── domain/
│   │   │               │   │   ├── mapper/
│   │   │               │   │   └── model/
│   │   │               │   ├── facade/
│   │   │               │   └── service/
│   │   │               ├── integration/
│   │   │               │   ├── http/
│   │   │               │   │   └── entity/
│   │   │               │   └── io/
│   │   │               └── persistence/
│   │   │                   ├── dao/
│   │   │                   └── entity/
│   │   └── resources/
│   │       ├── application-dev.yml
│   │       ├── application-evo.yml
│   │       ├── application-prod.yml
│   │       ├── application-sit.yml
│   │       ├── application.yml
│   │       └── banner.txt
├── Dockerfile
├── Dockerfile.native
├── LICENSE.md
├── pom.xml
└── README.md
```
