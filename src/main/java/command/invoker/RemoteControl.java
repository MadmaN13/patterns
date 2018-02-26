package command.invoker;

import command.command.common.Command;
import command.command.impl.NoCommand;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class RemoteControl {
    private List<Command> onCommands = new ArrayList<>();
    private List<Command> offCommands = new ArrayList<>();
    private Command undoCommand = new NoCommand();

    @NonNull
    private int size;

    public void setCommand(int slotNumber, Command onCommand, Command offCommand) {
        if (slotNumber >=0 && slotNumber < size) {
            onCommands.add(slotNumber,onCommand);
            offCommands.add(slotNumber,offCommand);
        }
        else {
            LOGGER.info("Cannot add command to slot " + slotNumber + " !");
        }
    }

    public void onButtonWasPressed(int slotNumber) {
        if (slotNumber <= size - 1) {
            Command toExecute = onCommands.get(slotNumber);
                   toExecute.execute();
            undoCommand = toExecute;
        }
        else {
            LOGGER.error("No button with number: " + slotNumber + "!");
        }
    }

    public void offButtonWasPressed(int slotNumber) {
        if (slotNumber <= size - 1) {
            Command toExecute = offCommands.get(slotNumber);
            toExecute.execute();
            undoCommand = toExecute;
        }
        else {
            LOGGER.error("No button with number: " + slotNumber + "!");
        }
    }

    public void undoButtonWasPressed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "onCommands=" + onCommands +
                ", offCommands=" + offCommands +
                '}';
    }
}
