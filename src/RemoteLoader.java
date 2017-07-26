import xyz.tritin.command.SimpleRemoteControl;
import xyz.tritin.command.commands.garagedoor.GarageDoorOpenCommand;
import xyz.tritin.command.commands.light.LightOnCommand;
import xyz.tritin.command.commands.garagedoor.GarageDoor;
import xyz.tritin.command.commands.light.Light;

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
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        GarageDoor door = new GarageDoor();
        GarageDoorOpenCommand openCommand = new GarageDoorOpenCommand(door);

        SimpleRemoteControl control = new SimpleRemoteControl()
                .setCommand(lightOnCommand)
                .buttonWasPressed()
                .setCommand(openCommand)
                .buttonWasPressed();
    }

}
