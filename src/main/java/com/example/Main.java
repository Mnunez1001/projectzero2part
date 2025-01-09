package com.example;

public class Main {
    public static void main(String[] args) {


    // Creat two new Bankaccount objects
    Bankaccount account1 = new Bankaccount();
    Bankaccount account2 = new Bankaccount(1234567, "Ash Ketchum", 700, "Checkings");

    System.out.println(account1.toString());
    System.out.println(account2.toString());






    }
}