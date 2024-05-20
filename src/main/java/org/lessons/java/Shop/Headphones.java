package org.lessons.java.Shop;

import java.math.BigDecimal;

public class Headphones extends Product {

    private String color;
    private boolean areWireless;

    public Headphones(String name, String description, BigDecimal price, BigDecimal vat, String color, boolean areWireless){
        super(name, description, price, vat);
        this.color = color;
        this.areWireless = areWireless;
    }

    @Override
    public String toString() {
        return "Headphones {" + "\n" +
                "code: " + getCode() + "\n" +
                "name: " + getName() + "\n" +
                "description: " + getDesc() + "\n" +
                "price: " + getPrice() + "$" + "\n" +
                "taxed price: " + getTaxedPrice(getPrice()) + "$" + "\n" +
                "color: " + color + "\n" +
                "areWireless: " + areWireless + "\n" +
                "}  \n";
    }
}
