package com.study.ood.principles;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    /**
     * 4. Polymorphism: Cat provides a different implementation of makeSound.
     */
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}
