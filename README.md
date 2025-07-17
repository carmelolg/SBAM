# SBAM - Spring Boot Architecture for Microservices

A starter template for Spring Boot applications, designed to quickly kickstart the development of microservices with a ready-to-use configuration.

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

## Project Structure

The main structure of the project is as follows:
```crmsh
spring-boot-microservice-template/
├── .mvn/               # Maven Wrapper files
├── src/                # Main source code
│   ├── main/
│   │   ├── java/       # Application's Java code
│   │   └── resources/  # Configuration files
│   └── test/           # Project tests
├── .gitignore          # Git ignored files
├── Dockerfile          # Containerization file (JVM)
├── Dockerfile.native   # Containerization file (GraalVM Native)
├── pom.xml             # Maven configuration file
└── README.md           # Project documentation
```

## License

MIT License

Copyright (c) 2025 carmelolg

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
