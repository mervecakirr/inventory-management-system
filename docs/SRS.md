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

# 4. Non-Functional Requirements

## Performance

| ID | Requirement |
|----|-------------|
| NFR-001 | The system shall respond to user requests within 2 seconds under normal load. |
| NFR-002 | The system shall support at least 100 concurrent users. |
| NFR-003 | The system shall process inventory updates in real time. |

---

## Security

| ID | Requirement |
|----|-------------|
| NFR-004 | User authentication shall be required before accessing the system. |
| NFR-005 | Passwords shall be securely encrypted. |
| NFR-006 | User roles shall determine access permissions. |

---

## Reliability

| ID | Requirement |
|----|-------------|
| NFR-007 | The system shall operate continuously with minimal downtime. |
| NFR-008 | All inventory transactions shall be stored reliably. |
| NFR-009 | Data consistency shall be maintained during failures. |

---

## Maintainability

| ID | Requirement |
|----|-------------|
| NFR-010 | The project shall follow SOLID principles. |
| NFR-011 | The project shall implement GoF Design Patterns. |
| NFR-012 | Source code shall be documented and modular. |

---

## Scalability

| ID | Requirement |
|----|-------------|
| NFR-013 | The system shall support adding new product types without modifying existing code. |
| NFR-014 | The architecture shall allow adding new notification channels easily. |
| NFR-015 | The system shall support future integration with ERP systems. |

---

## Availability

| ID | Requirement |
|----|-------------|
| NFR-016 | The system shall be available 99% of the time. |
| NFR-017 | Database backups shall be performed regularly. |

---

## Usability

| ID | Requirement |
|----|-------------|
| NFR-018 | The user interface shall be simple and intuitive. |
| NFR-019 | Error messages shall be meaningful and user-friendly. |

---

## Compatibility

| ID | Requirement |
|----|-------------|
| NFR-020 | The application shall support Java 21. |
| NFR-021 | The application shall use PostgreSQL as the database system. |

---

## Logging & Monitoring

| ID | Requirement |
|----|-------------|
| NFR-022 | All critical operations shall be logged. |
| NFR-023 | System errors shall be recorded for troubleshooting. |

---

## Testing

| ID | Requirement |
|----|-------------|
| NFR-024 | Unit tests shall be implemented using JUnit 5. |
| NFR-025 | The project shall be testable using REST API testing tools such as Postman. |

# 5. Business Rules

| ID | Business Rule |
|----|---------------|
| BR-001 | Every product must belong to exactly one category. |
| BR-002 | Every warehouse must have a unique identifier. |
| BR-003 | Product stock quantity cannot be negative. |
| BR-004 | Stock transfers must occur between existing warehouses. |
| BR-005 | Purchase orders increase stock quantities. |
| BR-006 | Sales orders decrease stock quantities. |
| BR-007 | Low-stock notifications shall be sent automatically. |
| BR-008 | Every stock movement shall be recorded. |
| BR-009 | Only administrators may delete products. |
| BR-010 | Reports are generated from the latest inventory data. |

# 6. System Features

The Inventory Management System consists of the following modules:

- Authentication & Authorization
- Product Management
- Category Management
- Warehouse Management
- Supplier Management
- Customer Management
- Purchase Order Management
- Sales Order Management
- Inventory Management
- Stock Movement Tracking
- Notification Management
- Report Generation
- ERP Integration
- Logging System

# 7. Design Patterns

The project applies the following Gang of Four (GoF) Design Patterns:

| Pattern | Purpose |
|----------|---------|
| Singleton | Database connection and logging |
| Factory Method | Product creation |
| Builder | Complex product creation |
| Strategy | Inventory valuation algorithms |
| Observer | Low stock notifications |
| State | Stock status management |
| Command | Inventory operations |
| Decorator | Optional product features |
| Facade | Simplified service access |
| Adapter | External ERP integration |
| Proxy | Repository access control |

# 8. Future Enhancements

Possible future improvements include:

- Barcode scanning support
- QR code integration
- Mobile application
- AI-based inventory prediction
- Dashboard with analytics
- Multi-language support
- Cloud deployment
- Docker and Kubernetes support
- Integration with SAP ERP
- Email report scheduling

