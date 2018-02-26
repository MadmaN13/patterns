package command.command.impl;

import command.command.common.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
    }

    @Override
    public void undo() {
    }
}
