package com.study.ood.basics.generalization;

/**
 * Specialization: A specific type of payment that inherits the general properties of Payment.
 */
public class CreditCardPayment extends Payment {
    
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount); // Uses the generalized 'amount' from the Payment class
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment of $" + amount + " for card: " + cardNumber);
    }
}
