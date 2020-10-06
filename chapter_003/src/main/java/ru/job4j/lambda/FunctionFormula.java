package ru.job4j.lambda;

import java.util.function.Function;

/**
 * Function. Рассчитать значение по формуле num * num + 2 * num + 1.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 06.10.2020
 */
public class FunctionFormula {
    /**
     * Метод расчёта значения по формуле.
     *
     * @param x Рассчитываемое число по формуле.
     * @return Значение рассчитанное по формуле.
     */
    public static double calculate(double x) {
        return calculate(t -> x * x + 2 * x + 1, x);
    }

    /**
     * Метод, с лямбдой, как аргумент.
     *
     * @param y Лямбда расчёта числа по формуле.
     * @param x Расчитываемое число по формуле.
     * @return Функция перехода объекта типа х к объекту типа y.
     */
    private static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
