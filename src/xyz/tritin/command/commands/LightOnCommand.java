package xyz.tritin.command.commands;

import xyz.tritin.command.commands.Command;
import xyz.tritin.command.devices.Light;

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
}
