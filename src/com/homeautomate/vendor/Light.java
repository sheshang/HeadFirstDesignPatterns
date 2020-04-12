package com.homeautomate.vendor;

public class Light {
    public Light(String location){
        System.out.println("Light is located at "+location);
    }

    public void on(){
        System.out.println("Light is On");
    }

    public void off(){
        System.out.println("Light is Off");
    }
}
