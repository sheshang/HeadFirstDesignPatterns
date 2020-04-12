package com.homeautomate.vendor;

public class CeilingFan {
    public CeilingFan(String location){
        System.out.println("CeilingFan is located at "+location);
    }

    public void on(){
        System.out.println("Fan is On");
    }

    public void off(){
        System.out.println("Fan is Off");
    }

    public void setSpeed(int i){
        System.out.println("Speed is set at "+i+" level");
    }

}
