package command.command.impl.hottub;

import command.command.common.Command;
import command.receiver.Hottub;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HottubOnCommand implements Command {

    private Hottub hottub;

    @Override
    public void execute() {
        hottub.on();
    }

    @Override
    public void undo() {
        hottub.off();
    }
}
