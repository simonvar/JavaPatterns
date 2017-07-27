package xyz.tritin.command.commands.stereo;

import xyz.tritin.command.commands.Command;

/**
 * <p>Date: 27.07.17 </p>
 *
 * @author Simon Tritin
 */
public class StereoOffCommand implements Command{

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
