package ru.job4j.comparator;

import java.util.Collections;
import java.util.List;

/**
 * Сортировка List. Метод Collections.sort().
 * Отсортировать переданный список строк, используя метод Collections.sort(),
 * в восходящем порядке. Среди элементов нет null.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 29.11.2020
 */
public class CollectionsSort {
    /**
     * Метод сортировки списка строк в восходящем порядке.
     * Среди элементов списка нет null.
     *
     * @param data Список строк.
     * @return Отсортированный список строк.
     */
    public static List<String> sort(List<String> data) {
        Collections.sort(data);
        return data;
    }
}
