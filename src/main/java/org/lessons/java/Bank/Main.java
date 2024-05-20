package org.lessons.java.Bank;

import java.util.Scanner;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        boolean keepWorking = true;
        Scanner myScanner = new Scanner(System.in);
        // int newAccountNumber = (int)(Math.random() * 1000) + 1;
        // int newAccountNumber = new Random().nextInt(1000);
        Account newAccount = new Account("Giordano Mercatali", 0);

        // System.out.println(newAccountNumber);
        System.out.println("Hi, user " + newAccount.accountNumber + ", what do you want to do today?");
        System.out.println("Add money (0),");
        System.out.println("Take money (1),");
        System.out.print("(Press anything else to ESC): ");
        int addOrTake = Integer.parseInt(myScanner.nextLine());

        while (keepWorking) {
            // System.out.print(keepWorking);
            // if (addOrTake == 0) {
            //     System.out.print("Add money: ");
            //     double moneyToAdd = Double.parseDouble(myScanner.nextLine());
            //     System.out.println("Current balance: " + newAccount.addMoney(moneyToAdd) + "$");
            // } else if (addOrTake == 1){
            //     System.out.print("Take money: ");
            //     double moneyToTake = Double.parseDouble(myScanner.nextLine());
            //     System.out.println("Current balance: " + newAccount.takeMoney(moneyToTake) + "$");
            // } else{
            //     keepWorking = false;
            //     break;
            // }
            // System.out.print("Want to do something else? ");
            // addOrTake = Integer.parseInt(myScanner.nextLine());
            switch (addOrTake) {
                case 0:
                System.out.print("Add money: ");
                double moneyToAdd = Double.parseDouble(myScanner.nextLine());
                System.out.println("Current balance: " + newAccount.addMoney(moneyToAdd) + "$");
                    break;
                case 1:
                System.out.print("Take money: ");
                double moneyToTake = Double.parseDouble(myScanner.nextLine());
                System.out.println("Current balance: " + newAccount.takeMoney(moneyToTake) + "$");
                    break;
                default:
                System.out.println("Until next time, farewell");
                keepWorking = false;
                    break;
            }
            System.out.print("What are you going to do next?");
            addOrTake = Integer.parseInt(myScanner.nextLine());
        }
    }
}
