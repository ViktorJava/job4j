package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Промежуточные операции. Метод filter(). Фильтрация чисел.
 * <p>
 * Отфильтровать список, оставив в нем только четные числа.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 17.12.2020
 */
public class FilterNumbers {
    public static List<Integer> filter(List<Integer> data) {
        return data.stream()
                   .filter(s -> s % 2 == 0)
                   .collect(Collectors.toList());
    }
}
