package command.command.impl.fan.stateful;

import command.receiver.CeilingFan;

public class CeilingFanHighCommand extends CeilingFanStatefulCommand {

    public CeilingFanHighCommand(CeilingFan fan) {
        super(fan);
    }

    @Override
    public void execute() {
        // save prev speed
        prevSpeed = fan.getSpeed();
        fan.high();
    }
}
