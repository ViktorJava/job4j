package ru.job4j.lambda;

import java.util.function.Function;

/**
 * Function. Получить корень квадратный из числа.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 05.10.2020
 */
public class FunctionSqrt {
    /**
     * Метод, получения квадратного корня из числа.
     *
     * @param x Число из которого получаем квадратный корень.
     * @return Квадратный корень из числа.
     */
    public static double calculate(double x) {
        return calculate(t -> Math.sqrt(x), x);
    }

    /**
     * Метод, с лямбдой как аргумент.
     *
     * @param y Лямбда квадратного корня.
     * @param x Число из которого извлекается квадратный корень.
     * @return Функция перехода объекта типа х к объекту типа y.
     */
    private static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
