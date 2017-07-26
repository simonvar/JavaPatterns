package xyz.tritin.command;

import xyz.tritin.command.commands.Command;
import xyz.tritin.command.commands.NoCommand;

/**
 * @author Simon
 * @since 26.07.17
 */
public class RemoteControl {
    private Command onCommands[];
    private Command offCommands[];

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "   ")
                        .append(offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
