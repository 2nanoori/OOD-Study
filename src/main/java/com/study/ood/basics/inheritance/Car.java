package com.study.ood.basics.inheritance;

/**
 * Child Class (Subclass)
 * The Car class inherits all properties (brand, speed) and methods (accelerate)
 * from the Vehicle class using the 'extends' keyword.
 */
public class Car extends Vehicle {
    
    // The child class can have its own unique properties
    private int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        // 'super' calls the constructor of the parent class (Vehicle)
        super(brand); 
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * The child class can have its own unique methods.
     */
    public void honk() {
        System.out.println("Beep beep! I am a " + numberOfDoors + "-door " + brand + " car.");
    }

    // Notice that we DO NOT need to write the accelerate() method here.
    // The Car class already has it because it inherited it from Vehicle!
}
