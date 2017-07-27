package xyz.tritin.command.commands.light;

/**
 * @author Simon
 * @since 26.07.17
 */
public class Light {

    private String stringId;

    public Light(String stringId) {
        this.stringId = stringId;
    }

    public void on(){
        System.out.println(stringId + " is On");
    }

    public void off(){
        System.out.println(stringId + " is Off");
    }

}
