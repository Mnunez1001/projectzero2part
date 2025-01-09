package com.example;

import java.util.Random;

public class Bankaccount {
    
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private Random rand = new Random();

    //random constructor
    public Bankaccount(){
      this.accountNumber = rand.nextInt(10000000);
      
      int nameChoice = rand.nextInt(5);
      if (nameChoice == 0){
        this.accountHolderName = "John rice";
      } else if (nameChoice == 1){
        this.accountHolderName = "Rob Taco";
      } else if (nameChoice == 2){
        this.accountHolderName = "Alex Burrito";
      } else if (nameChoice == 3){ 
        this.accountHolderName = "Ricky water";
      } else{
        this.accountHolderName = "Sally Juice";
      }

      this.balance = rand.nextInt(10000);

      int typeChoice = rand.nextInt(2);
        if (typeChoice == 0){
            this.accountType = "Checking";
        } else {
            this.accountType = "Savings";
        }

    }

    //constructor 
    public Bankaccount(int accountNumber, String accountHolderName, double balance, String accountType){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    //getters and setters
    public double getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getAccountType(){
        return accountType;
    }

    public void setAccountType(String accountType){
        this.accountType = accountType;
    }

    //toString method
    public String toString(){
        return "\n Account Number: " + accountNumber + "\nAccount Holder Name: " + 
        accountHolderName + "\nBalance: " + balance + "\nAccount Type: " + accountType;
    }

    //Method

    public void withdraw (double amount){
        if(isSufficiantFunds(amount)){
            balance -= amount;
            System.out.println("\nWithdrawal of $" + amount + " successful. Remaining balance: $" + balance);
        } else {
            System.out.println("Insufficiant funds. Withdrawal of $" + amount + " failed. Balance: $" + balance);

        }



    }

    //helper method
    public boolean isSufficiantFunds(double amount){
        return balance >= amount;
    }



    

}
