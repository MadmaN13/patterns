package command.invoker;

import command.command.impl.garage.GarageDoorOpenCommand;
import command.command.impl.light.LightOnCommand;
import command.receiver.GarageDoor;
import command.receiver.SimpleLight;
import command.receiver.common.Switchable;
import org.junit.Test;

public class SimpleRemoteControlTest {

    @Test
    public void buttonWasPressed() throws Exception {
        // receiver
        Switchable roomLight = new SimpleLight("room");
        // command
        LightOnCommand lightOnCommand = new LightOnCommand(roomLight);

        // initializer
        SimpleRemoteControl remote = new SimpleRemoteControl();
        remote.setSlot(lightOnCommand); // set command

        remote.buttonWasPressed(); // execute command

        //set new command
        GarageDoor door = new GarageDoor();
        GarageDoorOpenCommand doorOpenCommand = new GarageDoorOpenCommand(door);

        remote.setSlot(doorOpenCommand);
        remote.buttonWasPressed();
    }

}