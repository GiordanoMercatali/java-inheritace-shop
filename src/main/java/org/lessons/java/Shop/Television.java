package org.lessons.java.Shop;

import java.math.BigDecimal;

public class Television extends Product{
    
    private int inches;
    private boolean isSmart;

    public Television(String name, String description, BigDecimal price, BigDecimal vat, int inches, boolean isSmart){
        super(name, description, price, vat);
        
        this.inches = inches;
        this.isSmart = isSmart;
    }

    int getInches(){
        return inches;
    }

    boolean getIfItsSmart(){
        return isSmart;
    }

    @Override
    public String toString() {
        return "Television {" +
                "code: '" + getCode() +
                ", name: '" + getName() +
                ", description: '" + getDesc() +
                ", price: " + getPrice() + "$" + 
                ", taxed price: " + getTaxedPrice(getPrice()) + "$" +
                ", inches: " + inches + "''" +
                ", isSmart: " + isSmart +
                '}';
    }
}
