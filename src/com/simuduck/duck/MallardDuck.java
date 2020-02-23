package com.simuduck.duck;

import com.simuduck.behavior.FlyWithWings;
import com.simuduck.behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am Mallard duck");
    }
}
