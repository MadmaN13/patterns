package command.receiver;

import command.receiver.common.Switchable;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Hottub implements Switchable {

    protected int temperature = 25;

    @Override
    public void on() {
        LOGGER.info("Hottub is on!");
    }

    @Override
    public void off() {
        LOGGER.info("Hottub is off!");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        LOGGER.info("Temperature set: " + temperature);
    }

    public void jetsOn() {LOGGER.info("Jets are on!");}
    public void jetsOff() {LOGGER.info("Jets are off!");}
    public void circulate() {LOGGER.info("Circulating!");}
}


