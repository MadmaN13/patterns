package command.command.impl.tv;

import command.command.common.Command;
import command.receiver.TV;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TVOffCommand implements Command {

    private TV tv;

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
