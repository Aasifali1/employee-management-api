# Employee Management REST API

A Spring Boot REST API for managing employee records with CRUD operations, MySQL integration, validation, searching, pagination, sorting, exception handling, and Swagger/OpenAPI documentation.

## 🚀 Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven
- Bean Validation
- Swagger/OpenAPI
- Docker

---

## 📌 Project Architecture

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
MySQL Database
```

---

## 👨‍💼 Employee Entity

The Employee entity contains the following fields:

- id
- name
- email
- department
- salary
- age

---

## 📚 API Endpoints

### Employee Operations

#### Create Employee

```http
POST /api/employees
```

#### Get All Employees

```http
GET /api/employees
```

#### Get Employee By ID

```http
GET /api/employees/{id}
```

#### Update Employee

```http
PUT /api/employees/{id}
```

#### Delete Employee

```http
DELETE /api/employees/{id}
```

---

### Search Operations

#### Search Employees by Department

```http
GET /api/employees/search/department?department=IT
```

#### Search Employees by Name

```http
GET /api/employees/search/name?name=Rahul
```

#### Search Employees by Salary

```http
GET /api/employees/search/salary?salary=50000
```

---

## ✨ Additional Features

- CRUD Operations
- Spring Data JPA Derived Queries
- Custom JPQL Queries using `@Query`
- Global Exception Handling
- Request Validation
    - `@NotBlank`
    - `@Email`
    - `@Min`
    - `@Max`
- Pagination Support
- Sorting Support
- Swagger/OpenAPI Documentation
- Docker Support

---

## 🗄️ Database Setup

Create the MySQL database:

```sql
CREATE DATABASE employee_db;
```

Configure database properties in:

```text
src/main/resources/application.properties
```

Example configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

## ▶️ Running the Application

### Run Using Maven

```bash
mvn spring-boot:run
```

### Build and Run JAR

Build the application:

```bash
mvn clean package
```

Run the generated JAR:

```bash
java -jar target/employee-api-0.0.1-SNAPSHOT.jar
```

---

## 🌐 Application URL

```text
http://localhost:8080
```

---

## 📖 Swagger API Documentation

After starting the application, access Swagger UI:

```text
http://localhost:8080/swagger-ui/index.html
```

OpenAPI JSON Documentation:

```text
http://localhost:8080/v3/api-docs
```

---

## 🐳 Docker Support

A Dockerfile is included in the project root.

### Build the Application

```bash
mvn clean package -DskipTests
```

### Build Docker Image

```bash
docker build -t employee-api .
```

### Run Docker Container

```bash
docker run -p 8080:8080 employee-api
```

> Note: Docker deployment is optional and not required for this assignment.

---

## 📂 Project Structure

```text
src/main/java/com/example/employeeapi
│
├── controller
├── service
├── repository
├── entity
├── dto
├── exception
└── EmployeeApiApplication.java
```

---

## ✅ Features Demonstrated

- RESTful API Design
- Layered Architecture
- DTO Pattern
- JPA Repository
- Custom Queries
- Validation
- Exception Handling
- Pagination & Sorting
- API Documentation
- Containerization with Docker

---