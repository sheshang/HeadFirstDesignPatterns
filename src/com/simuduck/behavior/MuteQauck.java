package com.simuduck.behavior;

public class MuteQauck implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< silence >>");
    }
}
