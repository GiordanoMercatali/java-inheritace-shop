package org.lessons.java.Shop;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product("Apple", "Una mela al giorno toglie il medico di torno", 1.20, 22);
        // String name = apple.getName();
        // System.out.println("Product name: " + name);
        String codename = apple.getCodeName();
        System.out.println("Product: " + codename);
        String desc = apple.getDesc();
        System.out.println(desc);
        double price = apple.getPrice();
        System.out.println("Original price: " + price + "$");
        double taxedPrice = apple.getTaxedPrice(price);
        System.out.println("Price with taxes: " + taxedPrice + "$");
        // String code = apple.getCode();
        // System.out.println("Product code: " + code);
        
    }
}
