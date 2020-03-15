package com.starbuzz.beverage;

import com.starbuzz.utils.BeverageSize;

public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    public Espresso(BeverageSize size){
        description = "Espresso";
        this.size = size;
    }

    @Override
    public double cost(){

        switch (size){
            case TALL:
                return 1.99 / 2;
            case GRANDE:
                return 1.99;
            case VENTI:
                return 1.99 * 2;
            default:
                return 1.99;
        }
    }
}
