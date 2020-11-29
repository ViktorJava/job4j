package ru.job4j.comparator;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Способы сортировки. Сортировка Collection.
 * Сортировка через создание новой коллекции.
 * <p>
 * Задача: получить отсортированный сет по списку строк.
 * Среди элементов нет null.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 29.11.2020
 */
public class SortBySet {
    /**
     * Метод сортирует список строк, путём передачи списка
     * в коллекцию, которая хранит элементы в упорядоченном состоянии.
     *
     * @param list Список строк.
     * @return Отсортированное множество строк.
     */
    public static Set<String> sort(List<String> list) {
        return new TreeSet<>(list);
    }
}
