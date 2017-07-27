package xyz.tritin.command.commands.securitycontrol;

/**
 * @author Simon
 * @since 26.07.17
 */
public class SecurityControl {

    private String stringId;

    public SecurityControl(String stringId) {
        this.stringId = stringId;
    }

    public void arm(){
        System.out.println(stringId + " Armed");
    }

    public void disarm(){
        System.out.println(stringId + " Disarmed");
    }

}
