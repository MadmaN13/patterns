package command.receiver;

import command.receiver.common.Switchable;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TV implements Switchable {

    protected String inputChannel = "BBC";
    protected int volume = 5;
    protected String location;

    public TV(String location) {
        this.location = location;
    }

    @Override
    public void on() {
        LOGGER.info("TV is switched on " + inputChannel + " with volume: " + volume);
    }

    @Override
    public void off() {
        LOGGER.info("TV is off");
    }

    public void setInputChannel(String inputChannel) {
        this.inputChannel = inputChannel;
        LOGGER.info("Playing channel: " + inputChannel);
    }

    public void setVolume(int volume) {
        this.volume = volume;
        LOGGER.info("Volume: " + volume);
    }
}
