package com.starbuzz.beverage;

import com.starbuzz.utils.BeverageSize;

public abstract class Beverage {

    String description = "Unknown Beverage";
    BeverageSize size = BeverageSize.GRANDE;

    public String getDescription(){
        return description;
    }

    public BeverageSize getSize(){ return size; }

    public abstract double cost();
}
