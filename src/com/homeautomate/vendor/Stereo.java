package com.homeautomate.vendor;

public class Stereo {
    public Stereo(String location){
        System.out.println("Stereo is located at "+location);
    }

    public void on(){
        System.out.println("Stereo is On");
    }

    public void setCD(){
        System.out.println("CD is entered");
    }

    //volume can be set various commands like the speed of fan
    public void setVolume(int i){
        System.out.println("Volume is set at {"+i+"} level");
    }

    public void off(){
        System.out.println("Stereo is Off");
    }

    public void setDVD(){}

    public void setRadio(){}
}
