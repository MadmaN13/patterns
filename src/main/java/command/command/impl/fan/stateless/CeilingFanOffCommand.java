package command.command.impl.fan.stateless;

import command.command.common.Command;
import command.receiver.CeilingFan;

public class CeilingFanOffCommand implements Command {
    private CeilingFan fan;

    public CeilingFanOffCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.off();
    }

    @Override
    public void undo() {
        fan.on();
    }
}
