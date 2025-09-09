# Book Management System

A simple and scalable **Java Spring Boot** project for managing books and authors.  
This project demonstrates **RESTful API design**, **Spring Data JPA**, **Maven build system**, and **PostgreSQL integration with Docker**.

---

## 🚀 Features

- Full **CRUD operations** for Books and Authors
- RESTful API endpoints using **Spring Boot**
- PostgreSQL database support via **Docker Compose**
- Input validation using DTOs
- Layered architecture: **Controller → Service → Repository → Entity**


---

## 🛠 Technologies Used

- **Java 21**
- **Spring Boot**
- **Maven**
- **PostgreSQL**
- **Docker & Docker Compose**

- ## 📁 Project Structure

src/main/java/com/minilibrary
├── controller # REST controllers for Authors and Books
├── dto # Data Transfer Objects (request/response)
├── entity # JPA entities: Author, Book
├── repository # Spring Data JPA repositories
├── service # Business logic layer
└── BookAuthorSystemApplication.java # Main Spring Boot application

---

## ⚡ Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/Aysel63/Book-Managment.git
cd Book-Managment

---
## 2. Start PostgreSQL using Docker

docker-compose up -d
---
## 3. Run the application
./mvnw spring-boot:run

    The application will run on http://localhost:8080
---

## 📦 API Endpoints
Authors
Method	Endpoint	Description
GET	/authors	Get all authors
GET	/authors/{id}	Get author by ID
POST	/authors	Create a new author
PUT	/authors/{id}	Update author by ID
DELETE	/authors/{id}	Delete author by ID

Books
Method	Endpoint	Description
GET	/books	Get all books
GET	/books/{id}	Get book by ID
POST	/books	Create a new book
PUT	/books/{id}	Update book by ID
DELETE	/books/{id}	Delete book by ID

## 🔧 Configuration

The database connection is configured in:
src/main/resources/application.properties
Example:
spring.datasource.url=jdbc:postgresql://localhost:5432/bookdb
spring.datasource.username=postgres
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update

## 💡 Notes

Make sure Docker is running before starting PostgreSQL.

Use Postman or cURL to test REST endpoints.

DTOs are used to separate request/response from entity objects.



