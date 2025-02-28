# Java Order Management System

## Overview
This Java program implements an Order Management System using Object-Oriented Programming (OOP) principles. The system allows users to place orders for different products while handling stock management and discounts. The project demonstrates the use of inheritance, polymorphism, collections, and exception handling in Java.

---

## Key OOP Implementations

### 1. **Encapsulation**
Encapsulation is achieved by defining private and protected attributes in the `Product`, `Order`, `OrderDetails`, `Electronics`, and `Clothing` classes. These attributes can only be accessed or modified through public getter and setter methods, ensuring data integrity.

Example:
```java
private UUID productID;
private String name;
private double price;
private int stockQuantity;
```
Encapsulation prevents direct modification of object properties and provides controlled access through methods like `getPrice()` and `setStockQuantity()`.

---

### 2. **Inheritance**
Inheritance is used to extend the functionality of the `Product` class by creating specialized subclasses `Electronics` and `Clothing`.

Example:
```java
public class Electronics extends Product {
    private String brand;
    private boolean smartDevice;
}
```
`Electronics` and `Clothing` inherit common attributes and methods from `Product`, reducing code duplication and promoting reusability.

---

### 3. **Polymorphism**
Polymorphism is implemented using method overriding. The `calculateDiscount()` method in the `Product` class is overridden in the `Electronics` and `Clothing` subclasses to provide different discount calculations.

Example:
```java
@Override
public double calculateDiscount() {
    return getPrice() - (getPrice() * 0.15);
}
```
This allows different product types to have their own discount logic while maintaining a consistent method signature.

---

### 4. **Abstraction**
The `Product` class serves as an abstract blueprint for different types of products. Though it is not explicitly declared as an abstract class, it provides a structure that all product types must follow.

---

## Java Collections Used

### 1. **ArrayList for Storing Orders**
An `ArrayList<Order>` is used to store all orders dynamically.

Example:
```java
ArrayList<Order> orders = new ArrayList<>();
```
This allows efficient order management by providing dynamic resizing and fast access.

### 2. **HashMap for User Order History**
A `HashMap<UUID, List<Order>>` is used to store and retrieve orders by user ID.

Example:
```java
HashMap<UUID, List<Order>> orderHistory = new HashMap<>();
```
This provides fast lookups for a user's order history.

---

## Exception Handling
A custom exception `OutOfStockException` is created to handle cases where a product is out of stock.

Example:
```java
class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}
```
This ensures that invalid transactions are caught and handled gracefully.

---

## Conclusion
This project demonstrates how OOP principles can be applied to build a modular and scalable Java application. By leveraging encapsulation, inheritance, polymorphism, collections, and exception handling, the system efficiently manages orders while maintaining a clean and maintainable code structure.

