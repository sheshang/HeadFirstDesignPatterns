package com.simuduck.behavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can squeak");
    }
}
