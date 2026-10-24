# Sri Meenakshi Construction

A full-stack construction company website developed for **Sri Meenakshi Construction** using HTML, CSS, JavaScript, Java Spring Boot, and MySQL.

## Project Overview

Sri Meenakshi Construction is a responsive web application designed to showcase construction services, company information, completed projects, and provide a contact facility for customers.

The project consists of a frontend website and a Spring Boot backend with REST API and database integration.

## Features

* Responsive construction company website
* Company information and services
* Project showcase
* Professional navigation and user interface
* Contact form
* REST API for contact form submission
* Spring Boot backend
* MySQL database integration
* Contact information stored in the database
* Frontend and backend separated into independent modules

## Technologies Used

### Frontend

* HTML5
* CSS3
* JavaScript

### Backend

* Java
* Spring Boot
* Spring Data JPA
* REST API
* Maven

### Database

The backend uses **MySQL** to store contact form information.

Configuration lives in `backend/src/main/resources/application.properties` and reads credentials from environment variables, so no passwords are stored in the repository:

| Variable | Purpose | Default |
|---|---|---|
| `DB_USERNAME` | MySQL user | `root` |
| `DB_PASSWORD` | MySQL password | *(empty)* |
| `MYSQLHOST`, `MYSQLPORT`, `MYSQLDATABASE`, `MYSQLUSER`, `MYSQLPASSWORD` | Set automatically by Railway's MySQL service | `localhost`, `3306`, `sri_meenakshi_construction` |
| `SPRING_DATASOURCE_URL` | Optional full JDBC URL (overrides the above) | — |
| `MAIL_USERNAME` | Gmail address used to send notifications | *(empty)* |
| `MAIL_PASSWORD` | Gmail **App Password** (not your normal password) | *(empty)* |
| `PORT` | HTTP port | `8080` |

The database `sri_meenakshi_construction` and the `contacts` table are created automatically on first start (`spring.jpa.hibernate.ddl-auto=update`).

**Do not upload real database passwords or other credentials to a public GitHub repository.**

## How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/sri-meenakshi-construction.git
```

### 2. Requirements

* JDK 17 or newer
* Maven 3.9+ (or Eclipse / IntelliJ with Maven support)
* MySQL running locally on port 3306

### 3. Set Credentials

```bash
# Windows (PowerShell)
$env:DB_PASSWORD="your_mysql_password"
$env:MAIL_USERNAME="your_gmail@gmail.com"      # optional
$env:MAIL_PASSWORD="your_gmail_app_password"   # optional

# macOS / Linux
export DB_PASSWORD="your_mysql_password"
export MAIL_USERNAME="your_gmail@gmail.com"      # optional
export MAIL_PASSWORD="your_gmail_app_password"   # optional
```

### 4. Run Spring Boot

```bash
cd backend
mvn spring-boot:run
```

Or in Eclipse: import `backend` as an existing Maven project and run `ConstructionApplication.java`.

The backend will start on:

```text
http://localhost:8080
```

### 5. Run Frontend

Open `index.html` in a web browser (or serve the project root with any static server).

When opened locally (`file://` or `localhost`), the contact form automatically sends requests to `http://localhost:8080`. On the deployed website it uses the Railway backend URL defined in `script.js`.

## API

The contact form communicates with the Spring Boot backend through a REST API.

Example:

```text
POST /api/contact
```

The API receives contact information from the frontend and stores it in the MySQL database.

## Purpose

This project demonstrates practical experience in:

* Java development
* Spring Boot
* REST API development
* MySQL database integration
* HTML/CSS/JavaScript
* Full-stack web development
* Git and GitHub

## Developer

**Thulasidharan M**

Electronics and Communication Engineering
Java Full Stack Developer | Embedded & IoT Enthusiast

## License

This project is created for educational and portfolio purposes.
