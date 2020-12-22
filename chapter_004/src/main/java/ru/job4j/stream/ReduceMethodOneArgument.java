package ru.job4j.stream;

import java.util.List;

/**
 * Понятие редукции. Метод reduce(). Произведение чисел.
 * <p>
 * Найти произведение чисел, используя reduce() метод.
 * Размер списка всегда больше 0.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 22.12.2020
 */
public class ReduceMethodOneArgument {
    /**
     * Метод нахождения произведения чисел в списке данных целочисленного типа.
     *
     * @param data Список данных целочисленного типа.
     * @return Произведение чисел.
     */
    public static Integer reduce(List<Integer> data) {
        return data.stream()
                   .reduce((n1, n2) -> n1 * n2)
                   .get();
    }
}
