package xyz.tritin.command.commands.light;

import xyz.tritin.command.commands.Command;
import xyz.tritin.command.commands.light.Light;

/**
 * @author Simon
 * @since 26.07.17
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
