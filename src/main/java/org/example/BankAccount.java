package org.example;

public class BankAccount {
    private double balance;
    private double minimumBalance;

    //CONSTRUCTOR
    public BankAccount(double balance, double minimumBalance) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    //GETTERS
    //getter for balance
    public double getBalance() {
        return balance;
    }
    //getter for minimum balance
    public double getMinimumBalance() {
        return minimumBalance;
    }

    //withdrawal method
    public double withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
            return amount;
        } else {
            //throw a runtime exception if trying to withdraw too much
            throw new RuntimeException("Insufficient funds");
        }
    }

    //deposit method
    public double deposit(double amount) {
        return balance += amount;
    }





}
