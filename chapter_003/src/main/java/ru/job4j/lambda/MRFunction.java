package ru.job4j.lambda;

import java.util.function.Function;

/**
 * Method reference и Function.
 * Создание Function, через ссылку на метод.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 11.10.2020
 */
public class MRFunction {
    /**
     * Метод расчёта квадратного корня из числа.
     *
     * @return Квадратный корень числа.
     */
    public static Function<Double, Double> apply() {
        return Math::sqrt;
    }
}
