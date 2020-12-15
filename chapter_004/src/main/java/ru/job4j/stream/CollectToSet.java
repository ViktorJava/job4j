package ru.job4j.stream;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Сборка элементов. Сборка в Set.
 * <p>
 * Собрать, переданный стрим в сет.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 15.12.2020
 */
public class CollectToSet {
    /**
     * Метод сбора переданного стрима в Set.
     *
     * @param data Стрим целых чисел типа Integer.
     * @return Собранный сет из стрима.
     */
    public static Set<Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toSet());
    }
}
