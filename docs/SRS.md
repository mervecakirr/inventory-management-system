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

# 3. Functional Requirements

## Product Management

| ID | Requirement |
|----|-------------|
| FR-001 | The system shall allow administrators to create a new product. |
| FR-002 | The system shall allow administrators to update product information. |
| FR-003 | The system shall allow administrators to delete products. |
| FR-004 | The system shall allow users to search products by name or barcode. |
| FR-005 | The system shall display current stock quantity for each product. |

---

## Category Management

| ID | Requirement |
|----|-------------|
| FR-006 | The system shall allow administrators to create categories. |
| FR-007 | The system shall allow products to belong to exactly one category. |
| FR-008 | The system shall allow users to filter products by category. |

---

## Warehouse Management

| ID | Requirement |
|----|-------------|
| FR-009 | The system shall allow administrators to create warehouses. |
| FR-010 | The system shall assign products to warehouses. |
| FR-011 | The system shall support transferring stock between warehouses. |

---

## Supplier Management

| ID | Requirement |
|----|-------------|
| FR-012 | The system shall allow administrators to register suppliers. |
| FR-013 | The system shall associate suppliers with products. |
| FR-014 | The system shall maintain supplier contact information. |

---

## Inventory Management

| ID | Requirement |
|----|-------------|
| FR-015 | The system shall increase stock quantities after purchase orders. |
| FR-016 | The system shall decrease stock quantities after sales orders. |
| FR-017 | The system shall prevent stock quantities from becoming negative. |
| FR-018 | The system shall record every stock movement. |
| FR-019 | The system shall calculate inventory value using FIFO, LIFO, or Weighted Average strategies. |

---

## Notification Management

| ID | Requirement |
|----|-------------|
| FR-020 | The system shall notify users when stock falls below the minimum threshold. |
| FR-021 | The system shall support email notifications. |
| FR-022 | The system shall support SMS notifications. |
| FR-023 | The system shall support mobile notifications. |

---

## Reporting

| ID | Requirement |
|----|-------------|
| FR-024 | The system shall generate inventory reports. |
| FR-025 | The system shall generate sales reports. |
| FR-026 | The system shall generate purchase reports. |
| FR-027 | The system shall generate low-stock reports. |

---

## Security

| ID | Requirement |
|----|-------------|
| FR-028 | The system shall authenticate users before granting access. |
| FR-029 | The system shall authorize users according to their roles. |
| FR-030 | The system shall log important inventory operations. |