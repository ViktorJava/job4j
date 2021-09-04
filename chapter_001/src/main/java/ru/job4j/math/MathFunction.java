package ru.job4j.math;

/**
 * Класс статических математических операций.
 * Демонстрация применения статического импорта.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/4/2021
 */
public class MathFunction {
    /**
     * Сумма двух чисел.
     *
     * @param first  Первое число.
     * @param second Второе число.
     * @return Сумма двух чисел.
     */
    public static double sum(double first, double second) {
        return first + second;
    }

    /**
     * Произведение двух чисел.
     *
     * @param first  Первое число.
     * @param second Второе число.
     * @return Произведение двух чисел.
     */
    public static double multiply(double first, double second) {
        return first * second;
    }

    /**
     * Частное двух чисел.
     *
     * @param first  Первое число.
     * @param second Второе число.
     * @return Частное двух чисел.
     */
    public static double divide(double first, double second) {
        return first / second;
    }

    /**
     * Разность двух чисел.
     *
     * @param first  Первое число.
     * @param second Второе число.
     * @return Разность двух чисел.
     */
    public static double minus(double first, double second) {
        return first - second;
    }
}
