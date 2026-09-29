# Employee Management REST API

## Project Overview

Employee Management REST API is a Spring Boot application that provides CRUD operations for managing employee information.

The application follows a layered architecture:

Controller → Service → Repository → MySQL Database

## Use Case

The application manages employee records.

Each employee contains:

- ID
- Name
- Email
- Department
- Salary
- Age

## Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Bean Validation
- Gradle
- Swagger/OpenAPI
- Docker

## Project Architecture

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
MySQL Database
