package com.homeautomate.command;

import com.homeautomate.util.FanSpeed;
import com.homeautomate.vendor.CeilingFan;

public class CeilingFanHighCommand implements Command{
    CeilingFan ceilingFan;
    FanSpeed prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
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
