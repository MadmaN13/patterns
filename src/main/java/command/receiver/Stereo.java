package command.receiver;

import command.receiver.common.Switchable;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Stereo implements Switchable {

    public void on() {LOGGER.info("Stereo is on");}
    public void off() {LOGGER.info("Stereo is off");}
    public void setCd() {LOGGER.info("Cd mode is chosen");}
    public void setDvd() {LOGGER.info("Dvd mode is chosen");}
    public void setRadio() {LOGGER.info("Radio mode is chosen");}
    public void setVolume(int level) {LOGGER.info("Playing on volume: " + level);}
}
