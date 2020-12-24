package ru.job4j.stream;

import java.util.List;

/**
 * Терминальные операции. Метод noneMatch().
 * <p>
 * Проверить, что в списке нет пустых строк.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 23.12.2020
 */
public class NoneMatchMethod {
    /**
     * Метод проверки, что в с троке нет пустых строк.
     *
     * @param data String список строк.
     * @return boolean true в случае если есть пустая строка, иначе false.
     */
    public static boolean check(List<String> data) {
        return data.stream()
                   .noneMatch(s -> s.equals(""));
    }
}
