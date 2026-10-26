# Spring Boot Dependency Injection – Payment Service

## Overview
This project demonstrates Dependency Injection in Spring Boot using an interface and multiple implementation classes. It explains how Spring manages beans and selects the appropriate implementation using `@Primary` and `@Qualifier`.

## Concepts Covered
- Spring Boot REST API
- Dependency Injection (DI)
- Interface and Implementation
- Spring Beans and `@Service`
- Constructor Injection
- `@Primary` Annotation
- `@Qualifier` Annotation
- REST Controller and `@GetMapping`

## Project Structure
- **PaymentService** – Defines the payment service interface.
- **UPIPaymentService** – Implements the payment interface for UPI payments.
- **CardPaymentService** – Implements the payment interface for card payments.
- **PaymentController** – Handles HTTP requests and invokes the selected payment service.

## API Endpoint

**GET** `/cfs/pay`

This endpoint invokes the `pay()` method of the injected payment service and returns its response.

## How It Works
1. The `PaymentService` interface defines the payment operation.
2. Both UPI and Card payment classes implement this interface.
3. Spring registers the implementation classes as beans.
4. Constructor injection provides a `PaymentService` dependency to the controller.
