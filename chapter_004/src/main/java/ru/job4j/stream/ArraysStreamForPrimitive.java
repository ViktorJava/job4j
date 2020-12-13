package ru.job4j.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Создание стрима примитивов. Метод Arrays.stream().
 * <p>
 * Задача создать стрим из переданного массива.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 13.12.2020
 */
public class ArraysStreamForPrimitive {
    public static IntStream createStream(int[] data) {
        return Arrays.stream(data);
    }
}
