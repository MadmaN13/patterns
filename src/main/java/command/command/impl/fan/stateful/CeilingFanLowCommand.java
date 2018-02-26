package command.command.impl.fan.stateful;

import command.receiver.CeilingFan;

public class CeilingFanLowCommand extends CeilingFanStatefulCommand {
    public CeilingFanLowCommand(CeilingFan fan) {
        super(fan);
    }

    @Override
    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.medium();
    }
}
