package com.homeautomate.command;

public interface Command {
    void execute();
    void undo();
}
