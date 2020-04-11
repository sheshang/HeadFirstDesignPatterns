package com.homeautomate;

import com.homeautomate.command.GarageDoorOpenCommand;
import com.homeautomate.command.LightOnCommand;
import com.homeautomate.vendor.GarageDoor;
import com.homeautomate.vendor.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        System.out.println();

        GarageDoor garageDoor = new GarageDoor(light);
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
        System.out.println();


    }
}
