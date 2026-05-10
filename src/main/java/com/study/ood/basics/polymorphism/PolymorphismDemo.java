package com.study.ood.basics.polymorphism;

// 1. The Parent Interface (The common type)
interface Device {
    void turnOff();
}

// 2. Child Class 1
class TV implements Device {
    @Override
    public void turnOff() {
        System.out.println("TV: Turning off screen and going to standby mode.");
    }
}

// 3. Child Class 2
class SoundSystem implements Device {
    @Override
    public void turnOff() {
        System.out.println("SoundSystem: Saving volume state and powering down amplifiers.");
    }
}

// 4. Child Class 3
class Fan implements Device {
    @Override
    public void turnOff() {
        System.out.println("Fan: Stopping blades and cutting power to motor.");
    }
}

/**
 * Demonstrates the true power of Polymorphism using your Remote Control analogy!
 */
public class PolymorphismDemo {
    
    // =================================================================
    // THIS IS THE MAGIC OF POLYMORPHISM!
    // =================================================================
    // Notice that this method accepts ANY "Device". 
    // It doesn't care if you pass a TV, a Fan, or a SoundSystem.
    // It just blindly calls .turnOff() and trusts the object to do its own specific job.
    public static void pressPowerButton(Device anyDevice) {
        System.out.println("\n--- Pressing the power button on the remote ---");
        anyDevice.turnOff();
    }

    public static void main(String[] args) {
        Device myTv = new TV();
        Device mySoundSystem = new SoundSystem();
        Device myFan = new Fan();

        // We use the EXACT same method (pressPowerButton), 
        // but we get COMPLETELY DIFFERENT behaviors depending on the object!
        pressPowerButton(myTv);
        pressPowerButton(mySoundSystem);
        pressPowerButton(myFan);
    }
}
