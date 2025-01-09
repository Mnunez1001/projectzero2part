package com.example;

public class Bankaccount {
    //create a String variable called name
    private String name;
    private double balance;

    // create a constructor that takes a String and double parameter    
    public Bankaccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    
    // create getters and setters for the name and balance variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // create two methods that add and subtract from the balance
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    // create a toString method that returns the name and balance
    @Override
    public String toString() {
        return "Bankaccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
    

}
