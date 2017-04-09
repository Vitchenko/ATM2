package viv.home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by viv on 31.03.2017.
 */
public class ConsoleHelper {

    static BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

    public static void  writeMessage(String message){
        System.out.println(message);
    }

    public static String readString() throws IOException {

        return  bufferedReader.readLine();

    }

    /**2. Чтобы считать код валюты, добавим статический метод String askCurrencyCode() в ConsoleHelper.
     Этот метод должен предлагать пользователю ввести код валюты, проверять, что код содержит 3 символа.
     Если данные некорректны, то сообщить об этом пользователю и повторить.
     Если данные валидны, то перевести код в верхний регистр и вернуть.*/

    public static String askCurrencyCode() throws IOException {
        String curString="";

        writeMessage("Please, input Currency Code? (Example: USD)");
        curString=readString();
        boolean flag=false;
        do{
            if (curString.length()==3){
                curString=curString.toUpperCase();
                flag=true;
            }else{
                writeMessage("Input currency code is wrong.");
                writeMessage("Please, input Currency Code? (Example: USD)");
                curString=readString();
            }
        }while(flag=false);

        return curString;
    }


    /**3. Чтобы считать номинал и количество банкнот, добавим статический метод
     String[] getValidTwoDigits(String currencyCode) в ConsoleHelper.
     Этот метод должен предлагать пользователю ввести два целых положительных числа.
     Первое число - номинал, второе - количество банкнот.
     Никаких валидаторов на номинал нет. Т.е. 1200 - это нормальный номинал.
     Если данные некорректны, то сообщить об этом пользователю и повторить.
     Пример вводимых данных:
     200 5     */
    public static String[] getValidTwoDigits(String currencyCode) throws IOException {

        //Добавить проверку на то введены ли цифры???
        String[] array;
        String str1="";
        String str2="";
        int nom,kol;

        writeMessage("Please, input nominal and number of banknotes? (Example: 10 5)");
        while(true){
            array=readString().split(" ");
            try{
                nom=Integer.parseInt(array[0]);
                kol=Integer.parseInt(array[1]);
                break;
            }catch (Exception e){
                writeMessage("Invalid data");
                writeMessage("Please, re-input nominal and number of banknotes? (Example: 10 5)");
            }
        }
        return array;
    }

    /**2. В классе ConsoleHelper реализуйте логику статического метода Operation askOperation()
     Спросить у пользователя операцию.
     Если пользователь вводит 1, то выбирается команда INFO, 2 - DEPOSIT, 3 - WITHDRAW, 4 - EXIT;
     Используйте метод, описанный в п.1.
     Обработай исключение - запроси данные об операции повторно.*/

    public static Operation askOperation() throws IOException {
        writeMessage("Please,Chose operations (1)-INFO,(2)-DEPOSIT,(3)-WITHDRAW,(4)-EXIT,\n and input number?  ");
        int operNum;
        Operation oper;
        do{
            try{
                oper=Operation.getAllowableOperationByOrdinal(Integer.parseInt(readString()));
                break;
                }
            catch(Exception e){
                writeMessage("WrongDate!!!");
                writeMessage("Please,Chose operations (1)-INFO,(2)-DEPOSIT,(3)-WITHDRAW,(4)-EXIT,\n and input number?  ");
            }
        }while(true);

        return oper;
    }

}
