package com.study.ood.basics.demo;

import java.util.ArrayList;
import java.util.List;

public class PrincipleDemo {

    public static void main(String[] args) {
        System.out.println("--- 1. Encapsulation & Inheritance ---");
        // Creating an object of Dog
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");
        
        // We cannot access myDog.name directly (it is private), 
        // we must use the getter method provided by the Animal class (Inheritance & Encapsulation)
        System.out.println("Dog Name: " + myDog.getName());
        System.out.println("Dog Breed: " + myDog.getBreed());

        System.out.println("\n--- 2. Abstraction & Polymorphism ---");
        // We can treat Dog and Cat objects generally as "Animal" (Abstraction/Polymorphism)
        List<Animal> animals = new ArrayList<>();
        animals.add(myDog);
        animals.add(new Cat("Luna", 2));

        for (Animal animal : animals) {
            // Polymorphism in action: 
            // The program decides at runtime which makeSound() to call.
            // If the object is a Dog, it woofs. If it's a Cat, it meows.
            System.out.print(animal.getName() + " says: ");
            animal.makeSound();
        }
    }
}
