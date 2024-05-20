package org.lessons.java.Shop;

import java.util.Random;
import java.util.Scanner;

public class Product {    

    Scanner myScanner = new Scanner(System.in);
    private int code;
    private String name;
    private String description;
    private double price;
    private double vat; //IVA, based on Italian VAT (22%)

    public Product(){
        vat = 22;
    }

    public Product(String name, String description, double price, double vat){
        this.code = getRandomNumb();
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vatPerc(vat);
    }

    double vatPerc(double iva){
        return (iva / 100);
    }

    // double getPrice(){
    //     System.out.print("How much does this cost?");
    //     this.price = Double.parseDouble(myScanner.nextLine());
    //     return this.price;
    // }

    String getName(){
        return name;
    }

    double getPrice(){
        return price;
    }

    double getTaxedPrice(double priceToTax){
        // double price = Double.parseDouble(myScanner.nextLine());
        return priceToTax + (priceToTax * vat);
    }
    
    String getDesc()
    {
        return description;
    }

    // int getCode(){
    //     int newCode = code;
    //     // int newCode = (int)Math.random();
    //     return newCode;
    // }

    int getRandomNumb(){
       Random random = new Random();
       int rndNumb = new Random().nextInt(1, 1000000);
       return rndNumb;
    }

    String getCode(){
        //  String newCode = "0000" + String.valueOf(code);
        //  return newCode;
        return String.format("%06d", code);
    }

    String getCodeName(){
        String newCodeName = String.format("%06d", code);
        return  newCodeName + "-" + name;
    }
}