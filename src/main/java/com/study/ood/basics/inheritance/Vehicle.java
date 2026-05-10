package com.study.ood.basics.inheritance;

/**
 * Parent Class (Superclass)
 * This class contains common properties and methods that all vehicles share.
 */
public class Vehicle {
    
    // Protected means child classes can access these fields directly.
    protected String brand;
    protected int speed;

    public Vehicle(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    /**
     * A common behavior that all vehicles share.
     */
    public void accelerate(int increase) {
        this.speed += increase;
        System.out.println(this.brand + " is moving at " + this.speed + " km/h.");
    }
}
