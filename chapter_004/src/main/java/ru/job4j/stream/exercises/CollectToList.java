package ru.job4j.stream.exercises;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Сборка элементов. Сборка в List.
 * <p>
 * Собрать, переданный стрим в список.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 15.12.2020
 */
public class CollectToList {
    /**
     * Метод сбора переданного стрима целых чисел типа Integer
     * в ArrayList.
     *
     * @param data Стрим целых чисел типа Integer.
     * @return Собранный из стрима ArrayList.
     */
    public static List<Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toList());
    }
}
