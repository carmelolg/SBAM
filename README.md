# SBAM - Spring Boot Architecture for Microservices

[![logo](docs/logo.png)](docs/logo-png)

A starter template for Spring Boot applications, designed to quickly kickstart the development of microservices with a ready-to-use configuration.

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](https://creativecommons.org/licenses/by-nc-nd/4.0/)
[![Coverage](.github/badges/jacoco.svg)](.github/badges/jacoco.svg)
[![Branches](.github/badges/branches.svg)](.github/badges/branches.svg)

## Release Notes - Version 2.2.0
Here are the key updates and changes in this release:
- Upgrade Spring Boot to version 4.0.2
- Upgrade OpenAPI to version 3.1.0
- Update Dockerfiles for better performance and smaller image sizes
- Upgrade Maven to version 3.9.12
- Upgrade Jacoco to version 0.8.14
- Added maven compiler plugin configuration to enforce Java 25 compatibility

## Key Technologies

- **Spring Boot**: v4.0.1
- **OpenAPI**: v3.1.0 (for API documentation)
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

#### Disclaimer
This project is compiled and tested with JDK 25 and maven 3.9.12.<br>
**Feel free to contact me if the version declared above causes any issue.**

### Clone the Repository

Clone the Git repository to your local machine:

```bash
git clone https://github.com/carmelolg/spring-boot-microservice-template.git
cd spring-boot-microservice-template
```
---
## Building the Project

To build the project, use the following Maven command:
```bash
mvn clean install -U
```

If you want to skip tests during the build, run:
```bash
mvn clean install -U -DskipTests
```

---
## Running the Microservice

You can start the microservice using Maven:

```bash
mvn spring-boot:run
```

---

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

---

## API Documentation

The APIs are documented with Swagger. Once the microservice is running, you can access the API documentation at the following URL:

http://localhost:8080/swagger-ui/index.html

---

## Using Docker

You can containerize the project using the included Dockerfiles. 
This repository provides two Dockerfiles:

- Dockerfile (for standard JVM image)
- Dockerfile.native (for GraalVM Native image)

>Note: Building a GraalVM native image requires the GraalVM Native Image tool and may take additional time/resources.

1. **Build the Docker Image** (JVM):

```bash
# Build the Docker image (JVM)
docker build -t spring-boot-microservice-template -f Dockerfile .
# Run the container
docker run -p 8080:8080 spring-boot-microservice-template
```
2. **Build the Docker Image** (GraalVM Native):

```bash 
# Build the Docker image (Native)
docker build -t spring-boot-microservice-template-native -f Dockerfile.native .
# Run the container
docker run -p 8080:8080 spring-boot-microservice-template-native
```

The application will now be accessible at http://localhost:8080.

---

## Project Structure

The main structure of the project is as follows:
```crmsh
sbam/
├── `Dockerfile`
├── `Dockerfile.native`
├── `LICENSE.md`
├── `pom.xml`
├── `README.md`
├── `src/`
│   ├── `main/`
│   │   ├── `java/`
│   │   │   └── `io/`
│   │   │       └── `github/`
│   │   │           └── `carmelolg/`
│   │   │               └── `sbam/`
│   │   │                   ├── `Application.java`
│   │   │                   ├── `adapters/`
│   │   │                   │   └── `command/`
│   │   │                   ├── `controller/`
│   │   │                   │   └── `api/`
│   │   │                   │       ├── `v1/`
│   │   │                   │       └── `v2/`
│   │   │                   ├── `dto/`
│   │   │                   │   └── `mapper/`
│   │   │                   ├── `resource/`
│   │   │                   │   └── `assembler/`
│   │   │                   ├── `common/`
│   │   │                   │   ├── `config/`
│   │   │                   │   └── `security/`
│   │   │                   ├── `core/`
│   │   │                   │   └── `service/`
│   │   │                   │       └── `facade/`
│   │   │                   └── `persistence/`
│   │   │                       ├── `entity/`
│   │   │                       └── `repository/`
│   │   └── `resources/`
│   │       ├── `application-dev.yml`
│   │       ├── `application-evo.yml`
│   │       ├── `application-prod.yml`
│   │       ├── `application-sit.yml`
│   │       └── `application.yml`
└── `README.md`
```
---
## Architecture

The following diagram illustrates the architecture:

![Architecture Diagram](docs/architecture.svg)

---

## License

![CC BY-NC-ND 4.0](https://licensebuttons.net/l/by-nc-nd/4.0/88x31.png)

This project is licensed under the **Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International (CC BY-NC-ND 4.0)**.

See `LICENSE.md` for the full license text.
