package xyz.tritin.command.commands.garagedoor;

/**
 * @author Simon
 * @since 26.07.17
 */
public class GarageDoor {

    private String stringId;

    public GarageDoor(String stringId) {
        this.stringId = stringId;
    }

    public void up(){
        System.out.println(stringId + " is Open");
    }

    public void down(){
        System.out.println(stringId + " is Close");
    }

    public void stop(){}

    public void lightOn(){}

    public void lightOff(){}

}
