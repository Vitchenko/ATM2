package viv.home;

import java.util.HashMap;
import java.util.Map;

/**
 1. Создадим класс CurrencyManipulator, который будет хранить всю информацию про выбранную валюту.
 String currencyCode - код валюты, например, USD. Состоит из трех букв
 Map<Integer, Integer> denominations - это Map<номинал, количество>
 Чтобы можно было посмотреть, к какой валюте относится манипулятор, добавим геттер для currencyCode
 Очевидно, что манипулятор никак не может функционировать без названия валюты,
 поэтому добавим конструктор с этим параметром и проинициализируем currencyCode
 */
public class CurrencyManipulator {

    private String currencyCode;
    Map<Integer, Integer> denominations = new HashMap<>();

    public String getCurrencyCode() {
        return currencyCode;
    }

    public CurrencyManipulator(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    /**4. В классе CurrencyManipulator создайте метод void addAmount(int denomination, int count),
    который добавит введенные номинал и количество банкнот */
    public void addAmount(int denomination, int count){
        if(denominations.containsKey(denomination))
            denominations.put(denomination, denominations.get(denomination) + count);
        else
            denominations.put(denomination,count);
    }

    public int getTotalAmount(){
        Integer nom;
        Integer kol;
        int amount = 0;
        
        for (Map.Entry<Integer, Integer> entry : denominations.entrySet()) {
            nom = entry.getKey();
            kol = entry.getValue();
            amount=+(nom*kol);
        }
        return amount;
    }

}


