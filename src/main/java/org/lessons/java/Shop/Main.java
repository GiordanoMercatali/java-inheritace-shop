package org.lessons.java.Shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Product omen = new Product("HP Omen 16", "Gaming laptop", new BigDecimal(1122), new BigDecimal(0.22));
        // // String name = apple.getName();
        // // System.out.println("Product name: " + name);
        // String codename = omen.getCodeName();
        // System.out.println("Product: " + codename);
        // String desc = omen.getDesc();
        // System.out.println(desc);
        // BigDecimal price = omen.getPrice();
        // System.out.println("Original price: " + price + "$");
        // BigDecimal taxedPrice = omen.getTaxedPrice(price);
        // System.out.println("Price with taxes: " + taxedPrice + "$");
        // // String code = apple.getCode();
        // // System.out.println("Product code: " + code);
        
        Smartphone iphone = new Smartphone("iPhone 15", "This year's iPhone. It'll become obsolete in less than a year...", new BigDecimal(1399), new BigDecimal(0.22));
        System.out.println(iphone.getCodeName());
        System.out.println(iphone.getDesc());
        System.out.println(iphone.getPrice() + "$");
        System.out.println(iphone.getTaxedPrice(iphone.getPrice()) + "$");
        System.out.println(iphone.getRandomImei());
        System.out.println(iphone.getMaxStorage() + "GB");
    }
}
