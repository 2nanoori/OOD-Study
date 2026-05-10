package com.study.ood.basics.demo;

/**
 * 3. Inheritance: Dog acquires the properties and behaviors of Animal.
 * This promotes code reusability (we don't need to rewrite name and age logic).
 */
public class Dog extends Animal {

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // Calling the constructor of the parent class (Animal)
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * 4. Polymorphism: Dog provides its own specific implementation of the makeSound method.
     * Method overriding allows a child class to provide a specific behavior that differs
     * from other animals.
     */
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}
