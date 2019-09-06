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
        int numberOfPayments = amountWithPercent / monthly; //общее кол-во платежей
        int year = 0;

        while (numberOfPayments > 0) {

            if (numberOfPayments > 12) {
                numberOfPayments -= 12;
                year++;
            }
            if (numberOfPayments <= 12) {
                year++;
                break;
            }
        }
        return year;
    }
}
