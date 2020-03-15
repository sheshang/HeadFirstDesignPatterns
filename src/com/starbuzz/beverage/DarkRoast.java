package com.starbuzz.beverage;

import com.starbuzz.utils.BeverageSize;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "DarkRoast";
    }

    public DarkRoast(BeverageSize size){
        description = "DarkRoast";
        this.size = size;
    }

    @Override
    public double cost() {

        switch (size){
            case TALL:
                return 0.99 / 2;
            case GRANDE:
                return 0.99;
            case VENTI:
                return 0.99 * 2;
            default:
                break;
        }

        return 0.99;
    }
}
