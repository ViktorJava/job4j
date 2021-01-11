package ru.job4j.stream.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Промежуточные операции. Метод boxed().
 * <p>
 * Получить список Integer из массива int[].
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 24.12.2020
 */
public class BoxedMethod {
    /**
     * Метод получения списка данных целочисленного типа из массива примитивов.
     *
     * @param data int[] Массив данных примитивного типа.
     * @return Integer Список данных целочисленного типа.
     */
    public static List<Integer> boxed(int[] data) {
        return Arrays.stream(data)
                     .boxed()
                     .collect(Collectors.toList()
                     );
    }
}
