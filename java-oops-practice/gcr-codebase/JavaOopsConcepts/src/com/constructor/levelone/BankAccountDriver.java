package com.constructor.levelone;

class BankAccount {

    // Variables with access modifiers
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    // Parameterized Constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }

    // Public method to set balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Display Account Details
    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Subclass to demonstrate protected access
class SavingsAccount extends BankAccount {

    SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    void displaySavingsAccountDetails() {
        System.out.println("Savings Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

public class BankAccountDriver {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(12345, "Rohit", 50000);
        System.out.println("Bank Account Details:");
        account1.displayAccountDetails();

        account1.setBalance(55000);
        System.out.println("\nAfter Updating Balance:");
        System.out.println("Updated Balance: " + account1.getBalance());

        SavingsAccount savings = new SavingsAccount(67890, "Amit", 75000);
        System.out.println("\nSavings Account Details:");
        savings.displaySavingsAccountDetails();
    }
}
