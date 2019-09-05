package ru.job4j.loop;

/**
 * ТЗ [#173366]: 5.7. Ипотека.[#173366]
 * Нужно посчитать количество лет необходимых для погашения кредита.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.2
 * @since 05.09.2019
 */

public class Mortgage {
    /**
     * Метод int year(int amount, int monthly, int percent) считает
     * количество лет необходимых для погашения кредита.
     *
     * @param amount  сумма выданная по кредиту
     * @param monthly ежемесячный платеж
     * @param percent процентная ставка по кредиту
     * @return количество лет для погашения кредита
     */
    public static int year(int amount, int monthly, int percent) {
        int amountWithPercent = (amount / 100) * percent + amount;//задолженность с учётом процента
        int numberOfPayments = amountWithPercent / monthly; //кол-во платежей
        int bill = amountWithPercent;
        int year = 0;
        int month = 0;
//        int payPerYear = monthly * 12; //всего уплатить в год
//        int dolgCherezGod = amountWithPercent - payPerYear;//долг через год
//        int dolgCherezMesiac = amountWithPercent - monthly;//долг через месяц
        //int a = (int) Math.ceil((double) numberOfPayments / 12);

        while (bill > monthly) {
//        while (numberOfPayments>0) {
            if (numberOfPayments > 12) {
                numberOfPayments -= 12;
                year++;
            }
            if (numberOfPayments <= 12) {
                year++;
                break;
            }
            bill = bill - monthly;
            numberOfPayments--;
            month++;

            if (month == 12) {
                year++;
            }
        }
        return year;
    }
}
