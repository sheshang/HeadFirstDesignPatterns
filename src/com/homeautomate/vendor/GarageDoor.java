package com.homeautomate.vendor;

public class GarageDoor {
    Light light;

    public GarageDoor(Light light){
        this.light = light;
    }

    public void up(){
        System.out.println("Garage door is up");
    }

    public void down(){
        System.out.println("Garage door is down");
    }

    public void stop(){
        System.out.println("Garage door is stopped");
    }

    public void lightOn(){
        System.out.print("Garage ");
        light.on();
    }

    public void lightOff(){

    }
}
