package com.example;

import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {


    //  Bankaccount objects
    Bankaccount account1 = new Bankaccount();
    Bankaccount account2 = new Bankaccount(1234567, "Ash Ketchum", 700, "Checkings");
    
    // toString of the objects
    System.out.println(account1.toString());
    System.out.println(account2.toString());

    // withdraw method and helper method

    account2.withdraw(100);

    //ArrayList of Bankaccount objects
    ArrayList<Bankaccount> accounts = new ArrayList<Bankaccount>();

    //loop to add 5 Bankaccount objects to the ArrayList
    for (int i = 0; i < 5; i++){
        accounts.add(new Bankaccount());

        
    }

    //loop to print the toString of each Bankaccount object in the ArrayList
    for (int i=0; i < accounts.size(); i++){
        System.out.println(accounts.get(i).toString());

    
    }





    }

}