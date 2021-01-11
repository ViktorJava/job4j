package ru.job4j.stream.exercises;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Промежуточные операции. Метод sorted().
 * <p>
 * Получить список отсортированных строк.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 25.12.2020
 */
public class SortedMethod {
    /**
     * Метод получения списка отсортированных строк.
     *
     * @param data String Список строк подлежащий сортировки.
     * @return String Отсортированный список строк.
     */
    public static List<String> sorted(List<String> data) {
        return data.stream()
                   .sorted()
                   .collect(Collectors.toList());
    }
}
