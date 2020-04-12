package com.homeautomate.vendor;

import com.homeautomate.util.FanSpeed;

public class CeilingFan {
    FanSpeed speed;

    public CeilingFan(String location){
        System.out.println("CeilingFan is located at "+location);
        this.speed = FanSpeed.OFF;
    }

    public void low(){
        this.speed = FanSpeed.LOW;
        System.out.println("Fan is on LOW speed");
    }

    public void medium(){
        this.speed = FanSpeed.MEDIUM;
        System.out.println("Fan is on MEDIUM speed");
    }

    public void high(){
        this.speed = FanSpeed.HIGH;
        System.out.println("Fan is on HIGH speed");
    }

    public void off(){
        this.speed = FanSpeed.OFF;
        System.out.println("Fan is Off");
    }

    public void setSpeed(FanSpeed speed){
        this.speed = speed;
        System.out.println("Speed is set at "+speed+" level");
    }

    public FanSpeed getSpeed(){return this.speed;}

}
