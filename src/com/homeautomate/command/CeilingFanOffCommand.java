package com.homeautomate.command;

import com.homeautomate.util.FanSpeed;
import com.homeautomate.vendor.CeilingFan;

public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;
    FanSpeed prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        switch (prevSpeed){
            case LOW:
                ceilingFan.low();
                break;
            case MEDIUM:
                ceilingFan.medium();
                break;
            case HIGH:
                ceilingFan.high();
                break;
            case OFF:
                ceilingFan.off();
                break;
        }
    }
}
