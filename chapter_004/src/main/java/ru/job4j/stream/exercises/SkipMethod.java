package ru.job4j.stream.exercises;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Промежуточные операции. Метод skip().
 * <p>
 * Получить элементы списка, за исключением первых двух.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 21.12.2020
 */
public class SkipMethod {
    /**
     * Метод получения элементов списка, за исключением первых двух.
     *
     * @param data Список элементов типа String.
     * @return Список элементов полученных на входе в метод,
     * за исключением двух.
     */
    public static List<String> lastThree(List<String> data) {
        return data.stream()
                   .skip(2)
                   .collect(Collectors.toList());
    }
}
