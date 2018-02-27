package command.command.common;

import command.command.impl.hottub.HottubOffCommand;
import command.command.impl.hottub.HottubOnCommand;
import command.command.impl.light.LightOffCommand;
import command.command.impl.light.LightOnCommand;
import command.command.impl.stereo.StereoOffCommand;
import command.command.impl.stereo.StereoOnWithCdCommand;
import command.command.impl.tv.TVOffCommand;
import command.command.impl.tv.TVOnCommand;
import command.invoker.RemoteControl;
import command.receiver.Hottub;
import command.receiver.SimpleLight;
import command.receiver.Stereo;
import command.receiver.TV;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Slf4j
public class MacroCommandTest {

    @Test
    public void execute() throws Exception {
        String livingRoom = "Living room";
        // receivers
        SimpleLight light = new SimpleLight(livingRoom);
        TV tv = new TV(livingRoom);
        Stereo stereo = new Stereo(livingRoom);
        Hottub hottub = new Hottub();

        // commands
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        StereoOnWithCdCommand stereoOn = new StereoOnWithCdCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);

        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        List<Command> on = new ArrayList<>();
        on.add(lightOn); on.add(stereoOn);on.add(tvOn); on.add(hottubOn);
        MacroCommand partyOn = new MacroCommand(on);

        List<Command> off = new ArrayList<>();
        off.add(lightOff); off.add(stereoOff);off.add(tvOff); off.add(hottubOff);
        MacroCommand partyOff = new MacroCommand(off);

        // invoker
        RemoteControl remoteControl = new RemoteControl(1);
        remoteControl.setCommand(0, partyOn, partyOff);

        LOGGER.info("Let the party rock!");
        remoteControl.onButtonWasPressed(0);
        LOGGER.info("Party is over!");
        remoteControl.offButtonWasPressed(0);
        LOGGER.info("Undo button was pushed!");
        remoteControl.undoButtonWasPressed();
    }

}