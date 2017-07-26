package xyz.tritin.command.commands.stereo;

import xyz.tritin.command.commands.Command;
import xyz.tritin.command.commands.stereo.Stereo;

/**
 * @author Simon
 * @since 26.07.17
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
