package command.command.impl.garage;

import command.command.common.Command;
import command.receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    private GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.up();
    }

    @Override
    public void undo() {
        door.down();
    }
}
