package command.command.impl.hottub;

import command.command.common.Command;
import command.receiver.Hottub;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HottubOffCommand implements Command {

    private Hottub hottub;

    @Override
    public void execute() {
        hottub.off();
    }

    @Override
    public void undo() {
        hottub.on();
    }
}
