package com.study.ood.basics.abstraction;

/**
 * Represents a Coffee Machine to demonstrate Abstraction.
 * The user only needs to interact with the brewCoffee() method,
 * while the complex internal steps are completely abstracted (hidden) away.
 */
public class CoffeeMachine {

    /**
     * This is the public interface. This is all the user cares about.
     * They press the button, and they get coffee.
     */
    public void brewCoffee() {
        System.out.println("Starting coffee brewing process...");
        grindBeans();
        boilWater();
        pourWater();
        System.out.println("Your coffee is ready! Enjoy.");
    }

    /* 
     * ========================================================
     * COMPLEX INTERNAL DETAILS (Abstracted away from the user)
     * ========================================================
     */

    private void grindBeans() {
        System.out.println(" - [Internal] Grinding coffee beans to fine powder...");
    }

    private void boilWater() {
        System.out.println(" - [Internal] Boiling water to 95 degrees Celsius...");
    }

    private void pourWater() {
        System.out.println(" - [Internal] Pouring hot water over the ground beans...");
    }
}
