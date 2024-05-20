package org.lessons.java.Shop;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Cart {
    private final static int MAX_CART_SIZE = 3;
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        Product array[] = new Product[MAX_CART_SIZE];

        //General
        String name;
        String description;
        BigDecimal price;
        BigDecimal vat = new BigDecimal("0.22");

        //Smarthphone
        int storage;

        //Tv
        int inches;
        boolean isSmart;

        //Headphones
        String color;
        boolean areWireless;


        for(int i = 0; i < array.length; i++) {

            System.out.print("What kind of product do you want to buy? ");
            String nextProduct = myScanner.nextLine().toLowerCase();
            System.out.print("Product name: ");
            name = myScanner.nextLine();
            System.out.print("Product description: ");
            description = myScanner.nextLine();
            System.out.print("Product price: ");
            price = new BigDecimal(myScanner.nextLine());    
            

            switch (nextProduct) {
                case "smartphone":
                    System.out.print("Phone storage: ");
                    storage = Integer.parseInt(myScanner.nextLine());
                    array[i] = new Smartphone(name, description, price, vat, storage);
                    break;
                case "television":
                    System.out.print("TV inches: ");
                    inches = Integer.parseInt(myScanner.nextLine());
                    System.out.print("Is this TV smart? ");
                    isSmart = myScanner.nextBoolean();
                    array[i] = array[i] = new Television(name, description, price, vat, inches, isSmart);
                    break;
                case "headphones":
                    System.out.print("Headphones color: ");
                    color = myScanner.nextLine();
                    System.out.print("Are they wireless? ");
                    areWireless = myScanner.nextBoolean();
                    array[i] = new Headphones(name, description, price, vat, color, areWireless);
                    break;
                default:
                    array[i] = new Product(name, description, price, vat);
                    break;
            } 
        } 
    }
}
