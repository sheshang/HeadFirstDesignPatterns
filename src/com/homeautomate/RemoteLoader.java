package com.homeautomate;

import com.homeautomate.command.*;
import com.homeautomate.vendor.CeilingFan;
import com.homeautomate.vendor.GarageDoor;
import com.homeautomate.vendor.Light;
import com.homeautomate.vendor.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        Light garageLight = new Light("Garage");
        GarageDoor garageDoor = new GarageDoor(garageLight);
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, ceilingFanOn, ceilingFanOff);
        remote.setCommand(3, stereoOnWithCD, stereoOff);
        remote.setCommand(4, garageDoorUp, garageDoorDown);

        System.out.println(remote);

        remote.onButtonWasPressed(0);
        remote.offButtonWasPressed(0);
        remote.onButtonWasPressed(1);
        remote.offButtonWasPressed(1);
        remote.onButtonWasPressed(2);
        remote.offButtonWasPressed(2);
        remote.onButtonWasPressed(3);
        remote.offButtonWasPressed(3);




    }
}
