package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Промежуточные операции. Метод sorted() с компаратором.
 * <p>
 * Отсортировать строки по убыванию.
 * Нужно использовать Comparator.reverseOrder() для получения компаратора.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 26.12.2020
 */
public class SortedWithComparator {
    /**
     * Метод сортировки строк по убыванию.
     *
     * @param strings String Список неотсортированных строк.
     * @return String Список отсортированных по убыванию строк.
     */
    public static List<String> sorted(List<String> strings) {
        return strings.stream()
                      .sorted(Comparator.reverseOrder())
                      .collect(Collectors.toList());
    }
}
