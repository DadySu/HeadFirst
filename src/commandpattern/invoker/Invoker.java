package commandpattern.invoker;

import commandpattern.command.Command;

/**
 * Description 遥控器
 *
 * @author liub
 * @date 2019-05-17 18:50
 */
public class Invoker {

    private Command[] commandOn;
    private Command[] commandOff;

    private int num = 8;

    /**
     * 每个遥控器有十六个按钮，八个开，八个关
     */
    public Invoker() {
        this.commandOn = new Command[num];
        this.commandOff = new Command[num];
    }

    public void setCommandOn(int n, Command command) {
        this.commandOn[n] = command;
    }

    public void setCommandOff(int n, Command command) {
        this.commandOff[n] = command;
    }

    public void on(int n) {
        if (commandOn[n] != null) {
            commandOn[n].execute();
        } else {
            System.out.println("你瞎呀，这没开关");
        }
    }

    public void off(int n) {
        if (commandOff[n] != null) {
            commandOff[n].execute();
        } else {
            System.out.println("你瞎呀，这没开关");
        }
    }
}
