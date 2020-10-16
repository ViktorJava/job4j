package ru.job4j.lambda;

import java.util.function.Function;

/**
 * Function. Возвести число в квадрат.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 05.10.2020
 */
public class FunctionPow {
    /**
     * Метод, возведения числа в квадрат.
     *
     * @param x Возводимое число в квадрат.
     * @return Квадрат числа.
     */
    public static double calculate(double x) {
        return calculate(t -> Math.pow(x, 2), x);
    }

    /**
     * Метод, с лямбдой как аргумент.
     *
     * @param y Лямбда возведения числа в квадрат.
     * @param x Возводимое число в квадрат.
     * @return Функция перехода объекта типа х к объекту типа y.
     */
    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
