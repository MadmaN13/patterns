package command.command.common;

import lombok.AllArgsConstructor;

import javax.naming.OperationNotSupportedException;
import java.util.Collection;

@AllArgsConstructor
public class MacroCommand implements Command {

    private Collection<Command> commands;


    @Override
    public void execute() {
        for (Command c:commands) {c.execute();}
    }

    @Override
    public void undo() {
        for (Command c:commands) {c.undo();}
    }
}
