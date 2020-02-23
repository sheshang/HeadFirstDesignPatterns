package com.simuduck;

import com.simuduck.behavior.FlyWithRocket;
import com.simuduck.duck.Duck;
import com.simuduck.duck.MallardDuck;
import com.simuduck.duck.ModelDuck;

public class DuckSimulater {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();

        System.out.println("");

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        System.out.println("Changing the flying performance dynamically");
        model.setFlyBehavior(new FlyWithRocket());
        model.performFly();

    }
}
