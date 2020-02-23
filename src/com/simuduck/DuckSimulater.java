package com.simuduck;

import com.simuduck.duck.Duck;
import com.simuduck.duck.MallardDuck;

public class DuckSimulater {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();
    }
}
