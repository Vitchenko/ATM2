package viv.home;

import viv.home.command.CommandExecutor;

import java.io.IOException;
import java.util.Locale;


public class CashMachine {

    public static void main(String[] args) throws IOException {
        // write your code here
        Locale.setDefault(Locale.ENGLISH);
        /**1. Перенесите логику из main в DepositCommand и InfoCommand
         Проверим, что там стало с main? Цикл, в котором спрашиваем операцию у пользователя, а потом вызываем метод у CommandExecutor.
         И так до бесконечности... надо бы придумать условие выхода из цикла.
         Исправь цикл, чтоб он стал do-while. Условие выхода - операция EXIT.     */
        Operation curOper = null;
        int curNum = 0;
        do {
            ConsoleHelper.writeMessage("Choose Operations? Input operation number \n (1)INFO \n (2)DEPOSIT \n (3)WITHDRAW \n (4)EXIT :");
            try {
                curNum = Integer.parseInt(ConsoleHelper.readString());
            } catch (Exception e) {
                ConsoleHelper.writeMessage("Please Input operation number? ");
            }
            switch (curNum) {
                case 1:
                    CommandExecutor.execute(Operation.INFO);
                    break;
                case 2:
                    CommandExecutor.execute(Operation.DEPOSIT);
                    break;
                case 3:
                    CommandExecutor.execute(Operation.WITHDRAW);
                    break;
                case 4:
                    CommandExecutor.execute(Operation.EXIT);
                    break;
                default:

                    throw new IllegalArgumentException();

            }


        } while (curOper != Operation.EXIT);


    }
}
