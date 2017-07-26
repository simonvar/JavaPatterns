package xyz.tritin.command.commands.stereo;

/**
 * @author Simon
 * @since 26.07.17
 */
public class Stereo {

    private int volume = 5;

    public void on(){
        System.out.println("Stereo is On");
    }

    public void off(){
        System.out.println("Stereo is Off");
    }

    public void setCd(){
        System.out.println("Stereo CD is Set");
    }

    public void setDvd(){
        System.out.println("Stereo DVD is Set");
    }

    public void setRadio(){
        System.out.println("Stereo Radio is Set");
    }

    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("Stereo Volume set as " + volume);
    }
}
