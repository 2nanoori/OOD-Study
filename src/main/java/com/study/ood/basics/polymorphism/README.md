# Polymorphism

## Definition

**Polymorphism** (meaning "many forms") allows you to treat objects of different classes in a uniform way.
If a parent class `Vehicle` has a child class `Car`, you can write code that works with `Vehicle`, and it will automatically work with `Car` objects too.
The same action can have different behaviors depending on the object it is performed on.

## Real-World Analogy
Think of a **Remote Control**.

The remote has a "Power" button. This button behaves differently depending on the device you point it at:
* If you point it at a **TV**, the TV turns **OFF**.
* If you point it at a **Sound System**, the Sound System turns **OFF**.
* If you point it at a **Fan**, the Fan turns **OFF**.

The *action* (pressing the button) is the same, but the *result* (what happens) is different for each object.

## How to achieve Polymorphism in Java

In Java, polymorphism is primarily achieved through:

1.  **Method Overriding:** A child class provides a specific implementation for a method that is already defined in its parent class.
2.  **Inheritance:** The child class must inherit from the parent class to establish the "is-a" relationship.

**Example:**

```java
// Parent Class
class Vehicle {
    public void startEngine() {
        System.out.println("Vehicle engine starting...");
    }
}

// Child Class
class Car extends Vehicle {
    @Override
    public void startEngine() {
        // Specific implementation for Car
        System.out.println("Car engine starting with a key...");
    }
}

// Another Child Class
class ElectricCar extends Vehicle {
    @Override
    public void startEngine() {
        // Specific implementation for ElectricCar
        System.out.println("Electric car starting silently...");
    }
}
```

When you call `startEngine()` on different objects, you get different outputs:

```java
Vehicle v = new Vehicle();
Vehicle c = new Car();
Vehicle e = new ElectricCar();

v.startEngine(); // Output: Vehicle engine starting...
c.startEngine(); // Output: Car engine starting with a key...
e.startEngine(); // Output: Electric car starting silently...
```
