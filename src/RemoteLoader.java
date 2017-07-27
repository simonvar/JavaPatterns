import xyz.tritin.command.RemoteControl;
import xyz.tritin.command.commands.garagedoor.GarageDoor;
import xyz.tritin.command.commands.garagedoor.GarageDoorCloseCommand;
import xyz.tritin.command.commands.garagedoor.GarageDoorOpenCommand;
import xyz.tritin.command.commands.light.Light;
import xyz.tritin.command.commands.light.LightOffCommand;
import xyz.tritin.command.commands.light.LightOnCommand;
import xyz.tritin.command.commands.securitycontrol.SecurityControl;
import xyz.tritin.command.commands.securitycontrol.SecurityControlArmCommand;
import xyz.tritin.command.commands.securitycontrol.SecurityControlDisarmCommand;
import xyz.tritin.command.commands.stereo.Stereo;
import xyz.tritin.command.commands.stereo.StereoOffCommand;
import xyz.tritin.command.commands.stereo.StereoOnWithCDCommand;

/**
 * @author Simon
 * @since 26.07.17
 *
 * Паттерн "Команда" инкапсулирует запрос в виде
 * объекта, делая возможной параметризацию клиентских
 * объектов с другими запросамми, организацию
 * очереди или регистрацию запросов, а также
 * поддержку отмены операций.
 *
 */
public class RemoteLoader {

    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();

        Light kitchenLight = new Light("Kitchen Light");
        Light garageLight = new Light("Garage Light");
        SecurityControl securityControl = new SecurityControl("Main Security Control");
        GarageDoor garageDoor = new GarageDoor("Main Garage Door");
        Stereo stereo = new Stereo("Kitchen Stereo");

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOnCommand garageLightOn = new LightOnCommand(garageLight);

        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        LightOffCommand garageLightOff = new LightOffCommand(garageLight);

        SecurityControlArmCommand securityArm = new SecurityControlArmCommand(securityControl);
        SecurityControlDisarmCommand securityDisarm = new SecurityControlDisarmCommand(securityControl);

        GarageDoorOpenCommand openDoor = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand closeDoor = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);


        remoteControl.setCommand(0, securityArm, securityDisarm);
        remoteControl.setCommand(1, openDoor, closeDoor);
        remoteControl.setCommand(2, garageLightOn, garageLightOff);
        remoteControl.setCommand(3, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(4, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(4);

    }

}
