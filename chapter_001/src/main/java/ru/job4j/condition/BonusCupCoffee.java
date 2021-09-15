package ru.job4j.condition;

/**
 * Бонусные чашки кофе.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/13/2021
 */
public class BonusCupCoffee {

    /**
     * Возьми определенное количество чашек кофе
     * и следующую чашку ты получишь бесплатно.
     *
     * @param count Количество чашек кофе, за которые посетитель заплатил.
     * @param n     Количество чашек кофе, по достижении которого следующая
     *              чашка будет бесплатной.
     * @return Общее количество чашек кофе - оплаченных и бонусных.
     */
    public static int countCup(int count, int n) {
        return count / n + count;
    }
}
