package com.homeautomate;

import com.homeautomate.command.Command;
import com.homeautomate.command.NoCommand;
import com.homeautomate.util.ButtonType;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;
    ButtonType buttonType;
    int slot;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i< 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot){
        onCommands[slot].execute();
        buttonType = ButtonType.ON;
        this.slot = slot;
    }

    public void offButtonWasPressed(int slot){
        offCommands[slot].execute();
        buttonType = ButtonType.OFF;
        this.slot = slot;
    }

    // undoes only immediate last command
    public void undoButtonWasPressed(){
        if(buttonType == ButtonType.ON){
            undoCommand = onCommands[slot];
            buttonType = ButtonType.OFF;
        }
        else{
            undoCommand = offCommands[slot];
            buttonType = ButtonType.ON;
        }
        undoCommand.undo();

    }

    public String toString(){
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n---Remote Control---\n");
        for(int i = 0; i < onCommands.length; i++){
            stringBuff.append("[slot "+i+"] "+onCommands[i].getClass().getName()+" "+offCommands[i].getClass().getName()+"\n");
        }
        return stringBuff.toString();
    }
}
