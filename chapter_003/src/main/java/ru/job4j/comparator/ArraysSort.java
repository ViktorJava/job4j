package ru.job4j.comparator;

import java.util.Arrays;

/**
 * Сортировка массива примитивов.
 * Задача отсортировать переданный массив и вернуть его.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 26.11.2020
 */
public class ArraysSort {
    /**
     * Метод сортировки массива.
     *
     * @param data Массив целочисленных данных.
     * @return Отсортированный массив.
     */
    public static long[] sort(long[] data) {
        Arrays.sort(data);
        return data;
    }
}
