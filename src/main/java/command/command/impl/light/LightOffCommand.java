package command.command.impl.light;

import command.command.common.Command;
import command.receiver.common.Switchable;

public class LightOffCommand implements Command {
    private Switchable light;

    public LightOffCommand(Switchable light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
