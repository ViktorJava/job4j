package ru.job4j.stream;

import java.util.List;

/**
 * Понятие редукции. Метод min(). Поиск кратчайшей строки.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/18/2021
 */
public class MinMethod {
    /**
     * Метод находит строку минимальной длинны.
     *
     * @param list Список строк.
     * @return Строка минимальной длинны.
     */
    public static String min(List<String> list) {
        return list
                .stream()
                .min((n1, n2) -> Integer.compare(n1.length(), n2.length()))
                .get();
    }
}
