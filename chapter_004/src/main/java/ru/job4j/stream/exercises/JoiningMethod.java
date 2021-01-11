package ru.job4j.stream.exercises;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Сборка элементов. Сборка в строку.
 * <p>
 * Собрать строки списка в текст и добавить префикс "Prefix", и
 * суффикс "Suffix"(т.е. нужно использовать перегруженный вариант joining()).
 * Разделителем должен быть System.lineSeparator().
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 16.12.2020
 */
public class JoiningMethod {
    /**
     * Метод сбора строки из списка строк.
     *
     * @param strings Список строк.
     * @return Собранная строка.
     */
    public static String join(List<String> strings) {
        return strings.stream()
                      .collect(Collectors.joining(System.lineSeparator(),
                              "prefix", "suffix"));
    }
}
