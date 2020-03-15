package com.starbuzz.condiment;

import com.starbuzz.beverage.Beverage;
import com.starbuzz.utils.BeverageSize;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public BeverageSize getSize(){ return beverage.getSize(); }

    @Override
    public double cost() {

        switch (getSize()){
            case TALL:
                return 0.10 / 2 + beverage.cost();
            case GRANDE:
                return 0.10 + beverage.cost();
            case VENTI:
                return 0.10 * 2 + beverage.cost();
            default:
                return 0.10 + beverage.cost();
        }
    }
}
