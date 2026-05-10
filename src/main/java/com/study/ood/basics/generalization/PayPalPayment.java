package com.study.ood.basics.generalization;

/**
 * Specialization: Another specific type of payment that inherits from the general Payment class.
 */
public class PayPalPayment extends Payment {
    
    private String emailAddress;

    public PayPalPayment(double amount, String emailAddress) {
        super(amount); // Uses the generalized 'amount' from the Payment class
        this.emailAddress = emailAddress;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment of $" + amount + " for account: " + emailAddress);
    }
}
