package ru.job4j.loop;

/**
 * ТЗ [#173366]:Ипотека.
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
     * dept- задолженность с учётом процента
     * payments- общее кол-во платежей
     *
     * @param amount  сумма выданная по кредиту
     * @param monthly ежемесячный платеж
     * @param percent процентная ставка по кредиту
     * @return количество лет для погашения кредита
     */
    public static int year(int amount, int monthly, int percent) {
        int debt = (amount / 100) * percent + amount;
        int payments = debt / monthly;
        int year = 0;
        while (payments > 0) {
            if (payments > 12) {
                payments -= 12;
                year++;
            }
            if (payments <= 12) {
                year++;
                break;
            }
        }
        return year;
    }
}
