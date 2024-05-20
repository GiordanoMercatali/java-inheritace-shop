package org.lessons.java.Shop;

import java.math.BigDecimal;

public class Television extends Product{
    
    private int inches;
    private boolean isSmart;

    public Television(String name, String description, int inches, boolean isSmart, BigDecimal price, BigDecimal vat){
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
}
