package xyz.tritin.command.commands;

/**
 * @author Simon
 * @since 26.07.17
 */
public interface Command {

    void execute();
    void undo();

}
