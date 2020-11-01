package ru.job4j.condition;

/**
 * Стоит ли играть?
 * Необходимо реализовать метод так, чтобы при условии,
 * что сумма выигрыша (произведение вероятности и стоимости
 * выигрыша) превышает цену игры, метод вернул разницу между
 * этими величинами (т.е. чистую прибыль), или вернул 0
 * (при условии что читая прибыль меньше или равна 0).
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 01.11.2020
 */
public class Game {
    /**
     * Метод расчёта чистой прибыли.
     *
     * @param percent Вероятность выигрыша;
     * @param prize   Стоимость выигрыша;
     * @param pay     Цена игры.
     * @return Чистая прибыль.
     */
    public static int checkGame(double percent, int prize, int pay) {
        double result = percent * prize;
        if (result > pay) {
            return (int) result - pay;
        }
        return 0;
    }
}
