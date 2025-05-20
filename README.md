# Spring Boot Demo

This repository is a demonstration project for a basic Spring Boot application. It provides a RESTful API for managing `Adresse` entities, showcasing core concepts such as controllers, services, repositories, and integration with JPA for data persistence. The project also includes Docker support for containerized deployment.

## Features

- **REST API**: Exposes endpoints under `/api/v1/`, including a ping endpoint for health checks.
- **Entity Management**: Manages an `Adresse` entity with fields like `adresse`, `status`, and `line`.
- **JPA Integration**: Uses Spring Data JPA for repository access.
- **Service Layer**: Contains service logic for handling business operations on `Adresse` entities.
- **Testing**: Includes a basic test to verify the application context loads.
- **Docker Support**: Comes with a `Dockerfile` to simplify running in a containerized environment.

## Endpoints

- `GET /api/v1/ping` — Returns a pong message along with the host name.

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/example/demo/
│   │       ├── Controller/Controller.java
│   │       ├── DemoApplication.java
│   │       ├── Entity/Adresse.java
│   │       ├── Repository/AdresseInterface.java
│   │       └── services/BusAdresseService.java
│   └── resources/
│       └── application.properties
├── test/
│   └── java/com/example/demo/DemoApplicationTests.java
Dockerfile
```

## Getting Started

### Prerequisites

- Java 17+
- Maven

### Build and Run

```bash
# Build the project
mvn clean package

# Run the application
java -jar target/*.jar
```

By default, the application starts on port `8080`.

### Using Docker

```bash
# Build Docker image
docker build -t spring-boot-demo .

# Run container
docker run -p 8080:8080 spring-boot-demo
```

## License

This project is provided as a demo and does not include a specific license.
