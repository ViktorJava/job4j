package ru.job4j.stream;

import java.util.stream.Stream;

/**
 * Терминальные и промежуточные операции.
 * <p>
 * Вернуть количество элементов в стриме.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 19.12.2020
 */
public class CountMethod {
    /**
     * Метод подсчёта элементов в стриме.
     *
     * @param data Поток целых чисел типа Integer.
     * @return Колличество чисел в потоке.
     */
    public static long count(Stream<Integer> data) {
        return data.count();
    }
}
