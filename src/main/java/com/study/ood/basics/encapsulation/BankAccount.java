package com.study.ood.basics.encapsulation;

/**
 * Represents a bank account.
 * This class perfectly demonstrates Encapsulation by hiding the balance
 * and only allowing modifications through controlled methods.
 */
public class BankAccount {

    /**
     * The internal state of the account.
     * It is private to prevent unauthorized direct modifications.
     */
    private double balance;

    /**
     * Retrieves the current balance of the account.
     * 
     * @return the current balance
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     * Safely updates the balance. This is private because users
     * should only interact with deposit() and withdraw().
     * 
     * @param amount the new balance to set
     * @throws IllegalArgumentException if the amount is negative
     */
    private void setBalance(double amount) {
        if (amount >= 0) {
            this.balance = amount;
        } else {
            throw new IllegalArgumentException("Balance must be positive");
        }
    }

    /**
     * Adds funds to the account.
     * 
     * @param amount the amount of money to deposit
     * @throws IllegalArgumentException if the deposit amount is negative
     */
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount can not be lower than 0 ");
        }
        setBalance(getBalance() + amount);
    }

    /**
     * Removes funds from the account.
     * 
     * @param amount the amount of money to withdraw
     * @throws IllegalArgumentException if the withdraw amount is negative or
     *                                  exceeds the balance
     */
    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount can not be lower than 0 ");
        }
        if (getBalance() < amount) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        setBalance(getBalance() - amount);
    }
}
