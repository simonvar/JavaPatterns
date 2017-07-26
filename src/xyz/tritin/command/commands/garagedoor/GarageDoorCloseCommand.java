package xyz.tritin.command.commands.garagedoor;

import xyz.tritin.command.commands.Command;

/**
 * <p>Date: 26.07.17 </p>
 *
 * @author Simon Tritin
 */
public class GarageDoorCloseCommand implements Command{

    private GarageDoor door;

    public GarageDoorCloseCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.down();
    }
}
