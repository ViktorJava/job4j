package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * <h2>Подсчет функции в диапазоне. [#173315]</h2>
 * Реализован метод подсчета функции в диапазоне.
 * В тестах, реализованы функции:
 * - линейная (у = х).<p>
 * - квадратичная (у = х^2).<p>
 * - показательная (y = a^x, где a - постоянная).<p>
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 14.09.2020
 */
public class FunctionCalc {
    /**
     * Метод подсчета функции в диапазоне.
     *
     * @param start Начало диапазона.
     * @param end   Конец диапазона.
     * @param func  Функция.
     * @return Результат расчёта функции в диапазоне заданных значений.
     */
    public static List<Double> diapason(int start, int end,
                                        Function<Double, Double> func) {
        List<Double> list = new ArrayList<>();
        for (int i = start; i < end; i++) {
            list.add(func.apply((double) i));
        }
        return list;
    }
}
