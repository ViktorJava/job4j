package ru.job4j.stream.exercises;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Сборка элементов. Сборка в Map, когда есть дубликаты.
 * <p>
 * Собрать, переданный стрим чисел в мапу, где ключ сам элемент,
 * а значение это его квадрат. Учитывая дубликаты ключей.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 21.12.2020
 */
public class CollectToMapWhenDublicate {
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toMap(
                key -> key, value -> value * value, (prev, cur) -> prev)
        );
    }
}
