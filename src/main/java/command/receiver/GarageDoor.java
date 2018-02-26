package command.receiver;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GarageDoor {

    public void up() {LOGGER.info("Garage door is open!");};
    public void down() {LOGGER.info("Garage door is closed!");};
    public void stop() {};
    public void lightOn() {};
    public void lightOff() {};
}
