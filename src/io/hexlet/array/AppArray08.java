package io.hexlet.array;

public class AppArray08 {
    public static int getTotalAmount(String[] money, String currency) {
        int numberCoins = 0;    //собирается сумма
        for (String value : money) {
            if (currency.equals(value.substring(0, 3))) {
                int coin = Integer.parseInt(value.substring(4));
                numberCoins += coin;
            }
        }
        return numberCoins;
    }
}