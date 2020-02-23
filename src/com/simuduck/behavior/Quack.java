package com.simuduck.behavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can quack");
    }
}
