package command.receiver;

import command.receiver.common.Switchable;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimpleLight implements Switchable {

    private String location;

    public SimpleLight(String location) {
        this.location = location;
    }

    @Override
    public void on() {
        LOGGER.info(getClass().getSimpleName() + " in " + location +  " is on!");
    }

    @Override
    public void off() {
        LOGGER.info(getClass().getSimpleName() + " in " + location +  " is off!");
    }
}
