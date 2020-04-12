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

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, stereoOnWithCD, stereoOff);
        remote.setCommand(3, garageDoorUp, garageDoorDown);
        remote.setCommand(4, ceilingFanHigh, ceilingFanOff);
        remote.setCommand(5, ceilingFanLow, ceilingFanOff);

        System.out.println(remote);

        remote.onButtonWasPressed(0);
        remote.offButtonWasPressed(0);
        System.out.println();
        remote.onButtonWasPressed(1);
        remote.undoButtonWasPressed();
        System.out.println();
        remote.onButtonWasPressed(2);
        remote.offButtonWasPressed(2);
        System.out.println();
        remote.onButtonWasPressed(3);
        remote.undoButtonWasPressed();
        remote.undoButtonWasPressed();
        System.out.println();
        remote.onButtonWasPressed(4);
        remote.offButtonWasPressed(4);
        remote.undoButtonWasPressed();
        remote.onButtonWasPressed(5);
        remote.undoButtonWasPressed();
        remote.offButtonWasPressed(5);
        System.out.println();

    }
}
