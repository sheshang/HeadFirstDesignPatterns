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

    public void setVolume(int i){
        System.out.println("Volume is set at {"+i+"} level");
    }

    public void off(){}

    public void setDVD(){}

    public void setRadio(){}
}
