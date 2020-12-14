package ru.job4j.stream;

import java.util.stream.Stream;

/**
 * Создание стрима. Метод Stream.builder()
 * <p>
 * Создать стрим из первого и последнего элементов массива.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 14.12.2020
 */
public class StreamBuilder {
    /**
     * Метод создания Stream из первого и последнего элементов массива.
     *
     * @param data Массив.
     * @return Stream из первого и последнего элементов массива.
     */
    public static Stream<Object> createStream(Integer[] data) {
        return Stream.builder()
                     .add(data[0])
                     .add(data.length)
                     .build();
    }
}
