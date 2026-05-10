# Generalization

## Definition

Generalization is a concept in object-oriented programming (OOP) that refers to the process of creating a more general class from more specific classes. This is a way to reduce redundancy and increase code reusability.

## Real-World Analogy
Think of a **Vehicle**. A car, a bicycle, and a boat are all types of vehicles. They share common properties like a way to move and a way to stop. We can create a general class Vehicle that has these common properties, and then create more specific classes Car, Bicycle, and Boat that inherit from Vehicle. This is generalization - creating a more general class from more specific classes.

## How to achieve Generalization in Java
In Java, generalization is achieved using the `extends` keyword.

```java
// Parent Class (Generalization)
class Vehicle {
    public void move() {
        System.out.println("This vehicle moves.");
    }
    
    public void stop() {
        System.out.println("This vehicle stops.");
    }
}

// Child Class (Specialization) inherits from Vehicle
class Car extends Vehicle {
    public void drive() {
        System.out.println("The car drives on the road.");
    }
}

class Bicycle extends Vehicle {
    public void pedal() {
        System.out.println("The bicycle pedals on the road.");
    }
}
```

## Benefits of Generalization
1. **Code Reusability:** Reduces code duplication by allowing child classes to reuse the code of the parent class.
2. **Modularity:** Breaks down a complex system into smaller, more manageable components (parent and child classes).
3. **Extensibility:** New features can be added to a child class without modifying the parent class.
4. **Polymorphism:** Enables polymorphism, where objects of child classes can be treated as objects of the parent class.