package com.starbuzz.beverage;

import com.starbuzz.utils.BeverageSize;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "HouseBlend";
    }

    public HouseBlend(BeverageSize size){
        description = "HouseBlend";
        this.size = size;
    }

    @Override
    public double cost(){

        switch (size){
            case TALL:
                return 0.89 / 2;
            case GRANDE:
                return 0.89;
            case VENTI:
                return 0.89 * 2;
            default:
                break;
        }

        return 0.89;
    }
}
