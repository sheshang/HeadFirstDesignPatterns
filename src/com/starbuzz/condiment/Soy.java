package com.starbuzz.condiment;

import com.starbuzz.beverage.Beverage;
import com.starbuzz.utils.BeverageSize;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public BeverageSize getSize(){ return beverage.getSize(); }

    @Override
    public double cost() {

        switch (getSize()){
            case TALL:
                return 0.15 / 2 + beverage.cost();
            case GRANDE:
                return 0.15 + beverage.cost();
            case VENTI:
                return 0.15 * 2 + beverage.cost();
            default:
                return 0.15 + beverage.cost();
        }
    }
}
