package command.command.impl.fan.stateless;

import command.command.common.Command;
import command.receiver.CeilingFan;

public class CeilingFanOnCommand implements Command {
    private CeilingFan fan;

    public CeilingFanOnCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
    }

    @Override
    public void undo() {
        fan.off();
    }
}
