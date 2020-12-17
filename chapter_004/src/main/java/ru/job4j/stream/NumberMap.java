package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Промежуточные операции. Метод map(). Map с числами.
 * <p>
 * Задача, из заданного списка чисел получить список квадратов этих чисел.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 17.12.2020
 */
public class NumberMap {
    /**
     * Метод возвращает квадраты чисел.
     *
     * @param data Список чисел.
     * @return Список квадратов числе.
     */
    public static List<Integer> map(List<Integer> data) {
        return data.stream()
                   .map(n -> n * n)
                   .collect(Collectors.toList());
    }
}
