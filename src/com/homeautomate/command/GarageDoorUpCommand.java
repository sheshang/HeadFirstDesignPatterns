package com.homeautomate.command;

import com.homeautomate.vendor.GarageDoor;

public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute(){
        garageDoor.up();
        garageDoor.lightOn();
    }
}
