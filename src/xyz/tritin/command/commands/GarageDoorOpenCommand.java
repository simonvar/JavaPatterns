package xyz.tritin.command.commands;

import xyz.tritin.command.devices.GarageDoor;

/**
 * @author Simon
 * @since 26.07.17
 */
public class GarageDoorOpenCommand implements Command {
    private GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.up();
    }
}
