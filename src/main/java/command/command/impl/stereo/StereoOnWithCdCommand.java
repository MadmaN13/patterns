package command.command.impl.stereo;

import command.command.common.Command;
import command.receiver.Stereo;

public class StereoOnWithCdCommand implements Command {

    private Stereo stereo;

    public StereoOnWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(10);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
