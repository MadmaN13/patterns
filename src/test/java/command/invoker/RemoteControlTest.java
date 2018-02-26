package command.invoker;

import command.command.impl.fan.stateful.CeilingFanHighCommand;
import command.command.impl.fan.stateful.CeilingFanLowCommand;
import command.command.impl.fan.stateful.CeilingFanMediumCommand;
import command.command.impl.fan.stateless.CeilingFanOffCommand;
import command.command.impl.fan.stateless.CeilingFanOnCommand;
import command.command.impl.garage.GarageDoorDownCommand;
import command.command.impl.garage.GarageDoorOpenCommand;
import command.command.impl.light.LightOffCommand;
import command.command.impl.light.LightOnCommand;
import command.command.impl.stereo.StereoOffCommand;
import command.command.impl.stereo.StereoOnWithCdCommand;
import command.receiver.CeilingFan;
import command.receiver.GarageDoor;
import command.receiver.SimpleLight;
import command.receiver.Stereo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class RemoteControlTest {

    private static final String LIVING_ROOM = "";
    private static final String KITCHEN = "";

    @Test
    public void remoteControlTest() {
        // create invoker
        RemoteControl remoteControl = new RemoteControl(5);

        // create receivers
        SimpleLight livingRoomLight = new SimpleLight(LIVING_ROOM);
        SimpleLight kitchenLight = new SimpleLight(KITCHEN);
        CeilingFan ceilingFan = new CeilingFan(LIVING_ROOM);
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        // create commands and bind to receivers
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCdCommand stereoOn = new StereoOnWithCdCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        // bind commands to invoker
        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
        remoteControl.setCommand(1,kitchenLightOn,kitchenRoomLightOff);
        remoteControl.setCommand(2,ceilingFanOn,ceilingFanOff);
        remoteControl.setCommand(3,garageDoorOpen,garageDoorDown);
        remoteControl.setCommand(4,stereoOn,stereoOff);

        // invoke commands
        remoteControl.onButtonWasPressed(0); remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1); remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2); remoteControl.offButtonWasPressed(2);
        remoteControl.onButtonWasPressed(3); remoteControl.offButtonWasPressed(3);
        remoteControl.onButtonWasPressed(4); remoteControl.offButtonWasPressed(4);

        // press undo button
        remoteControl.undoButtonWasPressed();

    }

    @Test
    public void testStatefulCeilingFan() {
        // invoker
        RemoteControl remoteControl = new RemoteControl(3);

        // receiver
        CeilingFan fan = new CeilingFan(LIVING_ROOM);

        // create stateful commands
        CeilingFanLowCommand low = new CeilingFanLowCommand(fan);
        CeilingFanMediumCommand medium = new CeilingFanMediumCommand(fan);
        CeilingFanHighCommand high = new CeilingFanHighCommand(fan);
        CeilingFanOffCommand off = new CeilingFanOffCommand(fan);

        // set commands
        remoteControl.setCommand(0,low,off);
        remoteControl.setCommand(1,medium,off);
        remoteControl.setCommand(2,high,off);

        remoteControl.onButtonWasPressed(2);
        remoteControl.onButtonWasPressed(0);
        remoteControl.undoButtonWasPressed();
    }

}