package ru.job4j.condition;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 8/20/2021
 */
public class Club {
    /**
     * Метод permission выводит на консоль, можем мы пройти в клуб или нет.
     * Правила пропуска: или у посетителя есть деньги,
     * или посетитель - наш друг.
     *
     * @param hasMoney Наличие денег.
     * @param beFriend Наличие дружбы.
     */
    public static void permission(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
