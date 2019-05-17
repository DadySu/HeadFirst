package commandpattern.command.impl;

import commandpattern.button.Light;
import commandpattern.command.Command;

/**
 * Description
 *
 * @author liub
 * @date 2019-05-17 18:49
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
