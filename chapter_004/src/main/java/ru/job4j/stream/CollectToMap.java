package ru.job4j.stream;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Сборка элементов. Сборка в Map.
 * <p>
 * Собрать, переданный стрим чисел в мапу, где ключ сам элемент,
 * а значение это его квадрат.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 21.12.2020
 */
public class CollectToMap {
    /**
     * Метод сбора стрима чисел в мапу.
     *
     * @param data Стрим чисел типа Integer.
     * @return Мапа где ключ это элемент стрима,
     * а значение ключа- это его квадрат.
     */
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toMap(s -> s, s -> s * s));
    }
}
