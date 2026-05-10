package com.study.ood.basics.generalization;

/**
 * Generalization: We noticed that CreditCard, PayPal, and Cash all have an 'amount' 
 * and a way to 'process' the transaction. So, we extracted those common properties
 * and created this general 'Payment' class.
 */
public abstract class Payment {
    
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    /**
     * A general behavior that all specific payments must have.
     * We make it abstract because the exact way to process depends on the specific payment type.
     */
    public abstract void processPayment();
}
