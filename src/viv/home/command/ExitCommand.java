package viv.home.command;

import viv.home.ConsoleHelper;

/**
 * Created by viv on 07.04.2017.
 */
public class ExitCommand implements Command {
    @Override
    public void execute() {
        ConsoleHelper.writeMessage("Good Bye!");
    }
}
