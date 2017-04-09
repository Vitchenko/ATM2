package viv.home.command;

import viv.home.Operation;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by viv on 08.04.2017.
 */
public class CommandExecutor {

    private static Map<Operation, Command> map = new HashMap();

    static
    {
        //map.put(Operation.LOGIN, new LoginCommand());
        map.put(Operation.INFO, new InfoCommand());
        map.put(Operation.DEPOSIT, new DepositCommand());
        map.put(Operation.WITHDRAW, new WithdrawCommand());
        map.put(Operation.EXIT, new ExitCommand());
    }

    public static final void execute(Operation operation) throws IOException {
        map.get(operation).execute();
    }

    private CommandExecutor() {
    }
}
