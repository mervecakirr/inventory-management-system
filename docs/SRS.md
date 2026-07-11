# Software Requirements Specification (SRS)

**Project Name:** Inventory Management System

**Version:** 1.0

**Author:** Merve Çakır

**Date:** July 2026

---

# 1. Introduction

## 1.1 Purpose

The purpose of this project is to develop a modern Inventory Management System using Java and Spring Boot while applying Object-Oriented Programming principles, SOLID principles, and Gang of Four (GoF) Design Patterns.

The system aims to provide an efficient and scalable solution for managing products, warehouses, suppliers, stock movements, purchase orders, sales orders, notifications, and reporting processes.

The project is also intended as an educational and portfolio application demonstrating enterprise software architecture and design patterns.

---

## 1.2 Scope

The Inventory Management System enables organizations to manage inventory operations through a centralized application.

The system supports:

- Product Management
- Warehouse Management
- Supplier Management
- Customer Management
- Purchase Orders
- Sales Orders
- Stock Tracking
- Notification Management
- Report Generation
- User Authentication and Authorization

The application will be developed using Java Spring Boot with PostgreSQL as the database and will follow a layered architecture.

---

## 1.3 Intended Audience

This document is intended for:

- Software Developers
- Software Architects
- Project Managers
- Test Engineers
- University Supervisors
- Students

---

## 1.4 Technologies

- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Git & GitHub
- PlantUML
- JUnit 5
- Lombok

---

## 1.5 Goals

The primary goals of the system are:

- Improve inventory accuracy
- Reduce stock management errors
- Provide real-time inventory tracking
- Demonstrate GoF Design Patterns
- Apply SOLID principles
- Develop a maintainable and scalable software architecture

# 2. Overall Description

## 2.1 Product Perspective

The Inventory Management System is a standalone enterprise application designed to simplify inventory operations for organizations. It follows a layered architecture and applies Object-Oriented Programming principles together with GoF Design Patterns.

The system manages products, warehouses, suppliers, customers, purchase orders, sales orders, stock movements, and reporting.

---

## 2.2 Product Functions

The system provides the following core functionalities:

- User authentication
- Product management
- Category management
- Warehouse management
- Supplier management
- Customer management
- Purchase order management
- Sales order management
- Inventory tracking
- Stock movement tracking
- Low stock notifications
- Report generation
- Inventory valuation (FIFO, LIFO, Weighted Average)
- User authorization

---

## 2.3 User Classes

### Administrator

Responsible for managing the entire system.

Permissions:

- Manage users
- Manage products
- Manage warehouses
- View reports
- Configure notifications

---

### Warehouse Staff

Responsible for warehouse operations.

Permissions:

- Add stock
- Remove stock
- Transfer stock
- View inventory

---

### Manager

Responsible for monitoring business performance.

Permissions:

- View reports
- Monitor stock levels
- Approve purchase orders

---

### Supplier

Responsible for supplying products.

Permissions:

- View purchase orders
- Update delivery status

---

### Customer

Responsible for purchasing products.

Permissions:

- Place orders
- View order history

---

## 2.4 Operating Environment

- Windows 11
- Java 21
- Spring Boot
- PostgreSQL
- Maven
- Git
- GitHub

---

## 2.5 Design Constraints

The project must:

- Follow SOLID principles
- Apply GoF Design Patterns
- Use layered architecture
- Be implemented in Java
- Use PostgreSQL database
- Support future scalability

---

## 2.6 Assumptions and Dependencies

Assumptions:

- Database server is available.
- Users have valid accounts.
- Internet connection is available for notifications.

Dependencies:

- Spring Boot
- Spring Data JPA
- Lombok
- PostgreSQL
- Maven
- Git