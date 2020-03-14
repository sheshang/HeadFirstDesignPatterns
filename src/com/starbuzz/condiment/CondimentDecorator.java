package com.starbuzz.condiment;

import com.starbuzz.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();
}
