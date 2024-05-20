package org.lessons.java.Shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;

public class Product {    

    Scanner myScanner = new Scanner(System.in);
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal vat; //IVA, based on Italian VAT (22%)

    /*public Product(){
         vat = new BigDecimal(0.22);
    }*/

    public Product(String name, String description, BigDecimal price, BigDecimal vat){
        this.code = getRandomNumb();
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }

    // double vatPerc(double iva){
    //     return (iva / 100);
    // }

    String getName(){
        return name;
    }

    BigDecimal getPrice(){
        return price.setScale(2, RoundingMode.HALF_UP);
    }

    BigDecimal getTaxedPrice(BigDecimal priceToTax){
        return priceToTax.add(priceToTax.multiply(vat)).setScale(2, RoundingMode.HALF_UP);
    }
    
    String getDesc()
    {
        return description;
    }

    int getRandomNumb(){
       Random random = new Random();
       int rndNumb = new Random().nextInt(1, 1000000);
       return rndNumb;
    }

    String getCode(){
        return String.format("%06d", code);
    }

    String getCodeName(){
        String newCodeName = String.format("%06d", code);
        return  newCodeName + "-" + name;
    }

    @Override
    public String toString() {
        return "Product {" +
                "code: '" + getCode() + '\'' +
                ", name: '" + name + '\'' +
                ", description: '" + description + '\'' +
                ", price: " + price +
                ", taxed price: " + getTaxedPrice(price) +
                '}';
    }
}