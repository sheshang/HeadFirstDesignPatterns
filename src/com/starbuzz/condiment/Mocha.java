package com.starbuzz.condiment;

import com.starbuzz.beverage.Beverage;
import com.starbuzz.utils.BeverageSize;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription(){
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public BeverageSize getSize(){ return beverage.getSize(); }

    @Override
    public double cost() {

        switch (getSize()){
            case TALL:
                return 0.20 / 2 + beverage.cost();
            case GRANDE:
                return 0.20 + beverage.cost();
            case VENTI:
                return 0.20 * 2 + beverage.cost();
            default:
                return 0.20 + beverage.cost();
        }
    }
}
