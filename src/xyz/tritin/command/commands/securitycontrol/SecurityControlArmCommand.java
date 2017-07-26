package xyz.tritin.command.commands.securitycontrol;

import xyz.tritin.command.commands.Command;

/**
 * <p>Date: 26.07.17 </p>
 *
 * @author Simon Tritin
 */
public class SecurityControlArmCommand implements Command{
    SecurityControl control;

    public SecurityControlArmCommand(SecurityControl control) {
        this.control = control;
    }

    @Override
    public void execute() {
        control.arm();
    }
}
