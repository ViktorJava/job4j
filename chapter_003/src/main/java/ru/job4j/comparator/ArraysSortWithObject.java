package ru.job4j.comparator;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Сортировка массива объектов.
 * Отсортировать массив строк в убывающем порядке и вернуть его.
 * Среди строк не null элементов.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 26.11.2020
 */
public class ArraysSortWithObject {
    /**
     * Метод сортировки массива строк, в убывающем порядке.
     *
     * @param data Массив строк.
     * @return Массив строк отсортированный в убывающем порядке.
     */
    public static String[] sort(String[] data) {
        Arrays.sort(data, Comparator.reverseOrder());
        return data;
    }
}
