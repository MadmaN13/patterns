package command.receiver;

import command.receiver.common.SpeedControl;
import command.receiver.common.Switchable;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CeilingFan implements Switchable, SpeedControl {

    // add some state
    public static final int OFF = 0;
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;
    public String location;
    @Getter private int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    @Override
    public void on() {LOGGER.info(getClass().getSimpleName() + " in " + location + " is on!");}

    @Override
    public void off() {
        LOGGER.info(getClass().getSimpleName()+ " in " + location + " is off!");
        speed = OFF;
    }

    @Override
    public void high() {
        speed = HIGH;
    }

    @Override
    public void medium() {
        speed =  MEDIUM;
    }

    @Override
    public void low() {
        speed = LOW;
    }


}
