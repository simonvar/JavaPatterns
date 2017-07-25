package xyz.tritin.command;

import xyz.tritin.command.commands.Command;

/**
 * @author Simon
 * @since 26.07.17
 */
public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl setCommand(Command command){
        slot = command;
        return this;
    }

    public SimpleRemoteControl buttonWasPressed(){
        slot.execute();
        return this;
    }

}
