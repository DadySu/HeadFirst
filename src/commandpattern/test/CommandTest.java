package commandpattern.test;

import commandpattern.button.Light;
import commandpattern.command.impl.LightOffCommand;
import commandpattern.command.impl.LightOnCommand;
import commandpattern.invoker.Invoker;

/**
 * Description
 *
 * @author liub
 * @date 2019-05-17 18:55
 */
public class CommandTest {

    public static void main(String[] args) {

        Invoker invoker = new Invoker();

        Light light = new Light();
        LightOnCommand onCommand= new LightOnCommand(light);
        LightOffCommand offCommand = new LightOffCommand(light);

        invoker.setCommandOff(1,offCommand);
        invoker.setCommandOn(1,onCommand);

        invoker.on(1);
        invoker.off(1);

        invoker.off(2);
    }
}
