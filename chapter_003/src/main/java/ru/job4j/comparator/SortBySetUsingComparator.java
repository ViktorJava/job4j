package ru.job4j.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Сортировка через Set с использованием компаратора.
 * Получить сет из списка с порядком по убыванию. Среди элементов нет null.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 30.11.2020
 */
public class SortBySetUsingComparator {
    /**
     * Метод получения Set из List с порядком по убыванию.
     * Среди элементов нет null.
     *
     * @param data Список данных типа String, без null элементов.
     * @return Множество отсортированное по убыванию.
     */
    public static Set<String> sort(List<String> data) {
        Set<String> s = new TreeSet<>(Comparator.reverseOrder());
        s.addAll(data);
        return s;
    }
}
