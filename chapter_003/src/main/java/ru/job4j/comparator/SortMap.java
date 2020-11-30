package ru.job4j.comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Сортировка Map.
 * Получить отсортированную Map из исходной.
 * Сортировка должна быть в обратном порядке.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 01.12.2020
 */
public class SortMap {
    /**
     * Метод сортировки Map в обратном порядке.
     *
     * @param map Входная Map.
     * @return Отсортированная Map в обратном порядке.
     */
    public static Map<Integer, String> sort(Map<Integer, String> map) {
        Map<Integer, String> sortMap = new TreeMap<>(Comparator.reverseOrder());
        sortMap.putAll(map);
        return sortMap;
    }
}
