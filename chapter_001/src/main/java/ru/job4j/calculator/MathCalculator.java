package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

/**
 * Демонстрация применения статического импорта.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/4/2021
 */
public class MathCalculator {
    /**
     * Статический метод суммы и умножения.
     *
     * @param first  Первое число.
     * @param second Второе число.
     * @return Сумма.
     */
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    /**
     * Статический метод суммы, деления и умножения  двух чисел.
     *
     * @param first  Первое число.
     * @param second Второе число.
     * @return Сумма.
     */
    public static double divideAndMinus(double first, double second) {
        return divide(first, second) + minus(first, second);
    }

    /**
     * Статический метод суммы операций, сложения, умножения, деления и вычитания.
     *
     * @param first  Первое число.
     * @param second Второе число.
     * @return Сумма.
     */
    public static double allOperations(double first, double second) {
        return sumAndMultiply(first, second) + divideAndMinus(first, second);
    }

    public static void main(String[] args) {
        double first = 10.0;
        double second = 20.0;
        System.out.println("Результат расчёта sumAndMultiply равен: "
                + sumAndMultiply(first, second));
        System.out.println("Результат расчёта divideAndMinus равен: "
                + divideAndMinus(first, second));
        System.out.println("Результат расчёта allOperations равен: "
                + allOperations(first, second));
    }
}
