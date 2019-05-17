package commandpattern.command.impl;

import commandpattern.button.Light;
import commandpattern.command.Command;

/**
 * Description
 *
 * @author liub
 * @date 2019-05-17 18:44
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
