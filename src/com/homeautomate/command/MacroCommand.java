package com.homeautomate.command;

public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] partyOn) {
        this.commands = partyOn;
    }

    @Override
    public void execute() {
        for(int i = 0; i < commands.length; i++){
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for(int i = 0; i < commands.length; i++){
            commands[i].undo();
        }
    }
}
