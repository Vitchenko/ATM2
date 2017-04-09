package viv.home.command;


import viv.home.ConsoleHelper;
import viv.home.CurrencyManipulator;
import viv.home.CurrencyManipulatorFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 * Created by viv on 07.04.2017.
 */
public class InfoCommand implements Command {
    @Override
    public void execute() {
       /**2. Давайте запустим прогу и пополним счет на EUR 100 2 и USD 20 6, и посмотрим на INFO.
        Ничего не понятно, т.к. создались 2 манипулятора: первый для EUR, второй для USD.
        Давайте улучшим логику InfoCommand. Надо вывести баланс по каждому манипулятору.*/

        Collection<CurrencyManipulator> curArr = new ArrayList<>(CurrencyManipulatorFactory.getAllCurrencyManipulators());

        for(CurrencyManipulator cr: curArr){

            ConsoleHelper.writeMessage("Currency : " + cr.getCurrencyCode() + " Balance : " +cr.getTotalAmount());
        }

    }
}
