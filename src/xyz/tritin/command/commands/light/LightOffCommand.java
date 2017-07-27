package xyz.tritin.command.commands.light;

import xyz.tritin.command.commands.Command;
import xyz.tritin.command.commands.light.Light;

/**
 * @author Simon
 * @since 26.07.17
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
