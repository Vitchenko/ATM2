package viv.home.command;

import viv.home.ConsoleHelper;
import viv.home.CurrencyManipulator;
import viv.home.CurrencyManipulatorFactory;

import java.io.IOException;

/**
 * Created by viv on 07.04.2017.
 */
public class DepositCommand implements Command {
    @Override
    public void execute() throws IOException {
        String curCode;
        String[] array;
        int nom;
        int kol;

        curCode= ConsoleHelper.askCurrencyCode();
        array=ConsoleHelper.getValidTwoDigits(curCode);

        CurrencyManipulator currencyManipulator = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(curCode);
        currencyManipulator.addAmount(Integer.parseInt(array[0]),Integer.parseInt(array[1]));

    }
}
