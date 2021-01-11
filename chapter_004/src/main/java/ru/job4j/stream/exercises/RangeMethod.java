package ru.job4j.stream.exercises;

import java.util.stream.IntStream;

/**
 * Создание стрима примитивов. Методы range() и rangeClosed().
 * <p>
 * Создать стрим с использованием метода rangeClosed().
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 23.12.2020
 */
public class RangeMethod {
    /**
     * Метод создания стрима примитивов целого типа, в диапазоне.
     *
     * @param start int начало диапазона.
     * @param end   int конец диапазона.
     * @return Стрим примитивов целого типа.
     */
    public static IntStream createStream(int start, int end) {
        return IntStream.rangeClosed(start, end);
    }
}
