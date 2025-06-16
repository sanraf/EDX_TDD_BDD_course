#  Unit Testing in Java with JUnit: Custom Stack Example

This project demonstrates how to write unit tests in **Java** using **JUnit 5**, with a custom stack implementation. It illustrates core testing concepts such as **test fixtures**, **assertions**, and **test case construction**.

---

##  Learning Objectives

After reviewing this project, you will be able to:

-  Understand the role of test fixtures in unit testing
-  Write assertions to verify code behavior
-  Create and organize unit test cases using JUnit

---

##  What is a Stack?

A **stack** is a data structure that follows the **LIFO** (Last In, First Out) principle.

### Key Operations:
- `push(T data)` – Add data to the top of the stack
- `pop()` – Remove and return the top element
- `peek()` – View the top element without removing it
- `isEmpty()` – Check if the stack is empty
- `size()` – Get the number of elements

---

##  Stack Implementation

**`CustomStack.java`**
```java
package smartappdev.module_2_tdd;

public class CustomStack<T> {

    private Node<T> top;
    private int size;

    public CustomStack() {
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T data) {
        Node<
