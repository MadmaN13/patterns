package command.command.impl.garage;

import command.command.common.Command;
import command.receiver.GarageDoor;

public class GarageDoorDownCommand implements Command {
    private GarageDoor door;

    public GarageDoorDownCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.down();
    }

    @Override
    public void undo() {
        door.up();
    }
}
