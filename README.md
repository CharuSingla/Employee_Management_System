# 💼 Employee Management System

A **Java-based** Employee Management System built using **IntelliJ IDEA** and **MySQL**. This project enables basic CRUD (Create, Read, Update, Delete) operations for managing employee records via a console interface.

---

## ✨ Features

- ➕ Add new employees  
- 📋 View all employee records  
- ✏️ Update employee information  
- ❌ Delete employee records  
- 🔍 Search employees by ID or name  
- 💾 Persistent storage with MySQL

---

## 🛠 Tech Stack

- **Language:** Java  
- **IDE:** IntelliJ IDEA  
- **Database:** MySQL  
- **Connector:** JDBC (Java Database Connectivity)

---

## 🗃 Database Schema

**Database Name:** `employee_db`  
**Table Name:** `employees`

| Field      | Type           | Description                  |
|------------|----------------|------------------------------|
| id         | INT (Primary)  | Auto-generated Employee ID   |
| name       | VARCHAR(100)   | Full Name                    |
| department | VARCHAR(100)   | Department Name              |
| salary     | DOUBLE         | Monthly Salary               |
| email      | VARCHAR(100)   | Email Address                |

---

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/CharuSingla/employee-management-system.git
cd employee-management-system

### 2. Set up MySQL
Create the database and table:

CREATE DATABASE employee_db;
USE employee_db;
CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    department VARCHAR(100),
    salary DOUBLE,
    email VARCHAR(100)
);

### 3. Update database credentials in code
Edit the connection string in your Java file:

String url = "jdbc:mysql://localhost:3306/employee_db";
String user = "yourUsername";
String password = "yourPassword";

### 4. Run the project
Open the project in IntelliJ IDEA
Make sure MySQL server is running
Run the Main.java file

### Example Operations:
1. Add Employee
2. View All Employees
3. Update Employee
4. Delete Employee
5. Search Employee
6. Exit
