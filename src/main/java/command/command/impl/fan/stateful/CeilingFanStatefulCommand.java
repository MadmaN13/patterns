package command.command.impl.fan.stateful;

import command.command.common.Command;
import command.receiver.CeilingFan;

public abstract class CeilingFanStatefulCommand implements Command {

    protected CeilingFan fan;
    protected int prevSpeed;

    protected CeilingFanStatefulCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            fan.high();
        }
        else if (prevSpeed == CeilingFan.MEDIUM) {
            fan.medium();
        }
        else if (prevSpeed == CeilingFan.LOW) {
            fan.low();
        }
        else if (prevSpeed == CeilingFan.OFF) {
            fan.off();
        }
    }
}
