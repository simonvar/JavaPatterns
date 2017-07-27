package xyz.tritin.command.commands.stereo;

/**
 * @author Simon
 * @since 26.07.17
 */
public class Stereo {

    private String stringId;
    private int volume = 5;

    public Stereo(String stringId) {
        this.stringId = stringId;
    }

    public void on(){
        System.out.println(stringId + " is On");
    }

    public void off(){
        System.out.println(stringId + " is Off");
    }

    public void setCd(){
        System.out.println(stringId + " CD is Set");
    }

    public void setDvd(){
        System.out.println(stringId + " DVD is Set");
    }

    public void setRadio(){
        System.out.println(stringId + " Radio is Set");
    }

    public void setVolume(int volume){
        this.volume = volume;
        System.out.println(stringId + " Volume set as " + volume);
    }

    public int getVolume() {
        return volume;
    }
}
