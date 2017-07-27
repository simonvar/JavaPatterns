package xyz.tritin.command.commands;

/**
 * @author Simon
 * @since 26.07.17
 */
public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Команда не установлена");
    }

    @Override
    public void undo() {
        System.out.println("Команда не установлена");
    }
}
