# 🎓 Student Management System

A comprehensive Student Management System built with **Spring Boot**, **Spring MVC**, **Thymeleaf**, **Spring Data JPA**, and **MySQL**. This web application allows you to perform complete CRUD (Create, Read, Update, Delete) operations on student records with advanced search functionality and input validation.

## ✨ Features

*   ✅ **Add New Students** – Register students with complete information.
*   ✅ **View All Students** – Display students in a responsive table.
*   ✅ **Update Student Info** – Edit existing student records easily.
*   ✅ **Delete Students** – Remove records with a confirmation dialog.
*   ✅ **Search Functionality** – Search by name or email in real-time.
*   ✅ **Phone Validation** – Only accepts valid 10-digit numbers.
*   ✅ **Email Uniqueness** – Prevents duplicate email address registration.
*   ✅ **Success Messages** – Instant visual feedback for all user actions.
*   ✅ **Responsive Design** – Optimized for desktop, tablet, and mobile devices.

## 🛠 Technologies Used


| Technology | Version | Purpose |
| :--- | :--- | :--- |
| **Spring Boot** | 3.0.4 | Backend framework |
| **Java** | 17+ | Programming language |
| **Thymeleaf** | 3.1.1 | Template engine |
| **MySQL** | 8.0+ | Database |
| **Spring Data JPA** | 3.0.4 | Database operations |
| **Bootstrap** | 5.3 | Frontend styling |
| **Maven** | 3.8+ | Dependency management |

## 📋 Prerequisites

Before running this project, make sure you have the following installed:

*   ☕ **Java JDK 17** or higher
*   🗄️ **MySQL Server 8.0** or higher
*   📦 **Maven 3.8** or higher
*   🖥️ **IDE:** IntelliJ IDEA, Eclipse, or VS Code

## 🚀 Getting Started

1.  **Clone the repository:**
    ```bash
    git clone https://github.com
    ```
2.  **Configure Database:** 
    Update `src/main/resources/application.properties` with your MySQL username and password.
3.  **Build the project:**
    ```bash
    mvn clean install
    ```
4.  **Run the application:**
    ```bash
    mvn spring-boot:run
    ```
5.  **Access the App:**
    Open `http://localhost:8080` in your browser.

---
**Author:** [Mahir Khan](https://github.com)
