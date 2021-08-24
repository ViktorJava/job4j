package ru.job4j.condition;

/**
 * Логическое отрицание ! [#334072].
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 8/24/2021
 */
public class LogicNot {
    /**
     * Метод проверяет, что число четное.
     *
     * @param num Проверяемое число.
     * @return true если число четное, иначе false.
     */
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    /**
     * Проверяет, что число положительное.
     *
     * @param num Проверяемое число.
     * @return true если число положительное, иначе false.
     */
    public static boolean isPositive(int num) {
        return num > 0;
    }

    /**
     * Метод проверяет, что число нечетное.
     *
     * @param num Проверяемое число.
     * @return true если число нечетное, иначе false.
     */
    public static boolean notEven(int num) {
        return !isEven(num);
    }

    /**
     * Метод проверяет, что число неположительное.
     *
     * @param num Проверяемое число.
     * @return true если число неположительное, иначе false.
     */
    public static boolean notPositive(int num) {
        return num < 0;
    }

    /**
     * Метод проверяет, что число нечетное и положительное.
     *
     * @param num Проверяемое число.
     * @return true если число нечетное и положительное, иначе false.
     */
    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    /**
     * Метод проверяет, что число четное или не положительное.
     *
     * @param num Проверяемое число.
     * @return true если число четное или не положительное, иначе false.
     */
    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }
}
