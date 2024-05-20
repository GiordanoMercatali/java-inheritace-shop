package org.lessons.java.Shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Cart {
    private final static int MAX_CART_SIZE = 3;
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        Product array[] = new Product[MAX_CART_SIZE];
        String name;
        String description;


        for(int i = 0; i < array.length; i++) {

            System.out.print("What kind of product do you want to buy? ");
            String nextProduct = myScanner.nextLine().toLowerCase();
            System.out.print("Product name: ");
            name = myScanner.nextLine();
            System.out.print("Product description: ");
            description = myScanner.nextLine();            
            

            switch (nextProduct) {
                case "smartphone":
                    System.out.print("Product name: ");
                    int storage = Integer.parseInt(myScanner.nextLine());
                    array[i] = new Smartphone(name, description, new BigDecimal(1), new BigDecimal(0.22), storage);
                    break;
                case "television":
                    array[i] = array[i] = new Television(name, description, new BigDecimal(1), new BigDecimal(0.22), 1, true);
                    break;
                case "headphones":
                    array[i] = new Headphones(name, description, new BigDecimal(1), new BigDecimal(0.22), "red", false);
                    break;
                default:
                    break;
            }
        }
    }
}
