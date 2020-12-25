package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Промежуточные операции. Метод distinct(). Уникальные числа.
 * <p>
 * Собрать уникальные числа массива в список.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 25.12.2020
 */
public class DistinctForPrimitive {
    /**
     * Метод Сбора уникальных элементов массива в списке.
     *
     * @param data int[] Массив данных.
     * @return Integer список уникальных элементов целочисленного типа.
     */
    public static List<Integer> collect(int[] data) {
        return Arrays.stream(data)
                     .distinct()
                     .boxed()
                     .collect(Collectors.toList());
    }
}
