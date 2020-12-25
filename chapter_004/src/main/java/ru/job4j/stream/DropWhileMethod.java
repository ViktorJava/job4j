package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Промежуточные операции. Метод dropWhile().
 * <p>
 * Оставить в списке только положительные элементы.
 * Порядок элементов исходного списка может быть произвольным.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 25.12.2020
 */
public class DropWhileMethod {
    /**
     * Метод получает из списка только положительных значений элементов
     * целочисленного типа.
     *
     * @param data Integer Список элементов целочисленного типа
     *             положительного и отрицательного значений.
     * @return Integer Список элементов целочисленного типа
     * только положительного значения.
     */
    public static List<Integer> dropWhile(List<Integer> data) {
        return data.stream()
                   .sorted()
                   .dropWhile(n -> n < 0)
                   .collect(Collectors.toList());
    }
}
