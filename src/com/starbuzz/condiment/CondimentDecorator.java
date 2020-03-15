package com.starbuzz.condiment;

import com.starbuzz.beverage.Beverage;
import com.starbuzz.utils.BeverageSize;

public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();

    @Override
    public abstract BeverageSize getSize();
}
