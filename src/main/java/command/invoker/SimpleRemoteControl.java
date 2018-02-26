package command.invoker;

import command.command.common.Command;
import lombok.Setter;

public class SimpleRemoteControl {
    @Setter Command slot;

    public void buttonWasPressed() {
        slot.execute();
    }
}
