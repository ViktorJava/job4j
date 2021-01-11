package ru.job4j.stream.exercises;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Создание стрима из массива. Метод Arrays.stream()
 * <p>
 * Нужно создать стрим из переданного массива.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 14.12.2020
 */
public class ArraysStreamMethod {
    /**
     * Метод создания стрима из переданного массива.
     *
     * @param data Массив данных типа Integer.
     * @return Стрим из массива типа Integer.
     */
    public static Stream<Integer> createStream(Integer[] data) {
        return Arrays.stream(data);
    }
}
