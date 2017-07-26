package xyz.tritin.command.commands.securitycontrol;

import xyz.tritin.command.commands.Command;

/**
 * <p>Date: 26.07.17 </p>
 *
 * @author Simon Tritin
 */
public class SecurityControlDisarmCommand implements Command{

    SecurityControl control;

    public SecurityControlDisarmCommand(SecurityControl control) {
        this.control = control;
    }

    @Override
    public void execute() {
        control.arm();
    }

}
