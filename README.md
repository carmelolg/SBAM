# Spring Boot Microservice Template

A starter template for Spring Boot applications, designed to quickly kickstart the development of microservices with a ready-to-use configuration.

## Key Technologies

- **Spring Boot**: v2.3.6
- **Swagger**: v3 (for API documentation)
- **Maven**: for dependency management and build
- **Docker**: for containerization

---

## Getting Started

### Prerequisites

Make sure you have the following tools installed:

- **JDK**: Version 11 or higher
- **Maven**: Version 3.6 or higher
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

You can containerize the project using the included Dockerfile. Run the following commands to build and start the Docker image:
Build the Docker Image

```bash
docker build -t spring-boot-microservice-template .
```

## Run the Container

```bash
docker run -p 8080:8080 spring-boot-microservice-template
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
├── Dockerfile          # Containerization file
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