package command.command.impl.light;

import command.command.common.Command;
import command.receiver.common.Switchable;

public class LightOnCommand implements Command {
    private Switchable light;

    public LightOnCommand(Switchable light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
