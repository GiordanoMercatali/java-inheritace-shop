package org.lessons.java.Bank;

import java.util.Random;

public class Account {
    int accountNumber;
    String ownerName;
    double balance;

    Account(){
        balance = 0;
    }

    Account(String ownerName, double balance){
        this.accountNumber = newAccountNumber();
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public int newAccountNumber(){
        Random random = new Random();
        return new Random().nextInt(1000);
    }

    double addMoney(double moneyToAdd){
        if(moneyToAdd > 0){
            balance += moneyToAdd;
        } else{
            System.out.println("Insert valid amount");
        }
        return balance;
    }

    double takeMoney(double moneyToTake){
        if (moneyToTake <= balance) {
            if(moneyToTake > 0){
                balance -= moneyToTake;
            } else{
                System.out.println("Insert valid amount");
            }
        } else {
            System.out.println("Not enough money on this account!");
        }
        return balance;
    }
}
