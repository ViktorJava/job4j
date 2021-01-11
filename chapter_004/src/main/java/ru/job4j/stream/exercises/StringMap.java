package ru.job4j.stream.exercises;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Промежуточные операции. Метод map(). Map со строками.
 * <p>
 * Дан список строк. Нужно к каждой строке прибавить ".java"
 * Например: из {"One"} нужно получить {"One.java"}
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 26.12.2020
 */
public class StringMap {
    /**
     * Метод изменения строк входящего списка данных типа String.
     *
     * @param names String Список строк.
     * @return String список изменённых строк.
     */
    public static List<String> map(List<String> names) {
        return names.stream()
                    .map(s -> s + ".Java")
                    .collect(Collectors.toList());
    }
}
