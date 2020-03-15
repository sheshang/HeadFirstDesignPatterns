package com.starbuzz;

import com.starbuzz.beverage.Beverage;
import com.starbuzz.beverage.DarkRoast;
import com.starbuzz.beverage.Espresso;
import com.starbuzz.beverage.HouseBlend;
import com.starbuzz.condiment.Mocha;
import com.starbuzz.condiment.Soy;
import com.starbuzz.condiment.Whip;
import com.starbuzz.utils.BeverageSize;

public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getSize() + " cup of " + beverage1.getDescription() + " of $" + beverage1.cost());

        Beverage beverage2 = new DarkRoast(BeverageSize.VENTI);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getSize() + " cup of " + beverage2.getDescription() + " of $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend(BeverageSize.TALL);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getSize() + " cup of " + beverage3.getDescription() + " of $" + beverage3.cost());
    }
}
