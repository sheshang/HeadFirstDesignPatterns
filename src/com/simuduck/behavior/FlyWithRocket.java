package com.simuduck.behavior;

public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with the help of rocket");
    }
}
