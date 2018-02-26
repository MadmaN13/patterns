package command.command.impl.fan.stateful;

import command.receiver.CeilingFan;

public class CeilingFanMediumCommand extends CeilingFanStatefulCommand {
    public CeilingFanMediumCommand(CeilingFan fan) {
        super(fan);
    }

    @Override
    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.medium();
    }
}
