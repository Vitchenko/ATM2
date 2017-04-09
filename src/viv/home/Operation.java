package viv.home;

/**
 Задание 6
 Чтобы отрефакторить код в соответствии с паттерном Command, нужно выделить в коде несколько логических блоков кода.
 У нас пока два таких блока: 1) код операции DEPOSIT, 2) код операции INFO.
 Они захардкожены в методе main. Нужно от этого избавиться.
 Нужно сделать так, чтобы пользователь сам выбирал, какую операцию на данный момент нужно выполнять.

 1. В энум Operation добавьте статический метод Operation getAllowableOperationByOrdinal(Integer i)
 Должен возвращать элемент энума: для 1 - INFO, 2 - DEPOSIT, 3 - WITHDRAW, 4 - EXIT;
 На некорректные данные бросать IllegalArgumentException
 */
public enum Operation {

    INFO, DEPOSIT, WITHDRAW,EXIT;

    public static Operation getAllowableOperationByOrdinal(Integer i) {
        Operation oper;

        switch (i) {
            case 1:
                oper = Operation.INFO;
                break;
            case 2:
                oper = Operation.DEPOSIT;
                break;
            case 3:
                oper = Operation.WITHDRAW;
                break;
            case 4:
                oper = Operation.EXIT;
                break;
            default:
                throw new IllegalArgumentException();

        }
        return oper;
    }
}
