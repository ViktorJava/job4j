package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Промежуточные операции. Метод filter(). Фильтрация строк.
 * <p>
 * Задача отфильтровать список строк по следующему признаку. Строка должна
 * начинаться на "A" и заканчиваться с ".java"
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 17.12.2020
 */
public class FilterString {
    /**
     * Метод фильтрации списка строк по заданному признаку.
     *
     * @param data Список строк.
     * @return Отфильтрованный список строк.
     */
    public static List<String> filter(List<String> data) {
        return data.stream()
                   .filter(s -> s.startsWith("A"))
                   .filter(s -> s.endsWith("java"))
                   .collect(Collectors.toList());
    }
}
