# Inheritance

## Definition

Inheritance is a mechanism in object-oriented programming (OOP) that allows a class to inherit properties and methods from another class. This promotes code reusability and establishes an "is-a" relationship between classes.

## Key Concepts

* **Parent Class (Superclass/Base Class):** The class whose properties and methods are being inherited. It is the more general class.
* **Child Class (Subclass/Derived Class):** The class that inherits the properties and methods from the parent class. It is the more specific class.
* **"is-a" Relationship:** A fundamental concept in inheritance. If Class A inherits from Class B, we say that "A is a B".

## How Inheritance Works in Java

In Java, inheritance is achieved using the `extends` keyword.

```java
// Parent Class (Superclass)
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child Class (Subclass) inherits from Animal
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}
```

## Benefits of Inheritance

1. **Code Reusability:** Reduces code duplication by allowing child classes to reuse the code of the parent class.
2. **Modularity:** Breaks down a complex system into smaller, more manageable components (parent and child classes).
3. **Extensibility:** New features can be added to a child class without modifying the parent class.
4. **Polymorphism:** Enables polymorphism, where objects of child classes can be treated as objects of the parent class.

## Types of Inheritance

### 1. Single Inheritance
A child class inherits from only one parent class.

```java
class A {
    // methods...
}

class B extends A { // B inherits only from A
    // methods...
}
```

### 2. Multilevel Inheritance
A child class inherits from a parent class, which itself is a child class of another class.

```java
class A {
    // methods...
}

class B extends A {
    // B inherits from A
    // methods...
}

class C extends B { // C inherits from B (and indirectly from A)
    // methods...
}
```

### 3. Hierarchical Inheritance
Multiple child classes inherit from a single parent class.

```java
class A {
    // methods...
}

class B extends A { // B inherits from A
    // methods...
}

class C extends A { // C also inherits from A
    // methods...
}
```

### 4. Hybrid Inheritance (Multiple Inheritance through Interfaces)
Java does not support multiple inheritance of classes (a class cannot inherit from two parent classes). However, it achieves a similar effect through **interfaces** (covered in the next section).

### 5. Multiple Inheritance (Not Supported for Classes)
A child class cannot inherit from two parent classes in Java.

```java
class A {
    // methods...
}

class B {
    // methods...
}

class C extends A, B { // Invalid in Java!
    // This would cause a compilation error
}
```
