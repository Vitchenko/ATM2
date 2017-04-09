package viv.home;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by viv on 31.03.2017.
 */
public class CurrencyManipulatorFactory {

    private static HashMap<String, CurrencyManipulator> map = new HashMap();
    boolean ifExist;



    public static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode){

        CurrencyManipulator currencyManipulator=null;
        if (map.containsKey(currencyCode))
        {
            currencyManipulator=map.get(currencyCode);
        }else
        {
            currencyManipulator= new CurrencyManipulator(currencyCode);
            map.put(currencyCode,currencyManipulator);
        }


        return currencyManipulator;
    }

    private CurrencyManipulatorFactory() {
    }

    public static Collection<CurrencyManipulator> getAllCurrencyManipulators()
    {
        return map.values();
    }

}
