package com.study.ood.principles;

/**
 * 1. Abstraction: We hide complex implementation details and only show the essential features.
 * Here, we define what an Animal is and what it does, without providing the full implementation.
 */
public abstract class Animal {
    
    /**
     * 2. Encapsulation: We restrict direct access to attributes using private access modifiers,
     * and provide public getter/setter methods. This protects the data's integrity.
     */
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) { // Encapsulation allows us to validate data (e.g., age cannot be negative)
            this.age = age;
        }
    }

    /**
     * Abstract method (Abstraction): Every animal makes a sound, but each animal makes a different sound.
     * Subclasses are forced to provide the specific implementation.
     */
    public abstract void makeSound();
}
