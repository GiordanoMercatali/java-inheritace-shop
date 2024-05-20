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
}
