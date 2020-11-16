package ru.job4j.lambda;

import java.util.List;
import java.util.Optional;

/**
 * Optional. Методы of() и empty().
 * Написать метод поиска строки среди списка строк.
 * Если значение найдено, то нужно вернуть Optional из этого значения,
 * в противном случае вернуть пустой Optional.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 16.11.2020
 */
public class OptionalOfAndEmpty {
    /**
     * Метод поиска строки среди списка строк.
     *
     * @param strings Список строк.
     * @param value   Строка.
     * @return Optional найденной строки в списке строк,
     * иначе пустой Optional.
     */
    public static Optional<String> findValue(List<String> strings, String value) {
        if (strings.contains(value)) {
            return Optional.of(value);
        }
        return Optional.empty();
    }
}
