package ru.job4j.stream;

import java.util.Collection;
import java.util.stream.Stream;

/**
 * Создание стрима. Метод stream().
 * <p>
 * Создать стрим из переданной коллекции.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 19.12.2020
 */
public class StreamMethod {
    /**
     * Метод создания стрима из переданной коллекции.
     *
     * @param data Коллекция целочисленных значений.
     * @return Стрим целочисленных значений.
     */
    public static Stream<Integer> createStream(Collection<Integer> data) {
        return data.stream();
    }
}
