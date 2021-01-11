package ru.job4j.stream.exercises;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Промежуточные операции. Метод takeWhile().
 * <p>
 * Получить из списка только отрицательные элементы.
 * Элементы исходного списка могут идти в произвольном порядке.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 25.12.2020
 */
public class TakeWhileMethod {
    /**
     * Метод получения только отрицательных значений из списка элементов
     * целочисленного типа.
     *
     * @param data Integer Список элементов целочисленного типа.
     * @return Integer Список элементов целочисленного типа,
     * отрицательного значения.
     */
    public static List<Integer> takeWhile(List<Integer> data) {
        return data.stream()
                   .sorted()
                   .takeWhile(n -> n < 0)
                   .collect(Collectors.toList());
    }
}
