package ru.job4j.comparator;

import java.util.Comparator;

/**
 * Получение компаратора. Метод nullsFirst().
 * Задача получить null-friendly компаратор для строки.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 29.11.2020
 */
public class NullFirstMethod {
    /**
     * Метод создаёт null-friendly компаратор натурального порядка, для строки.
     *
     * @return Компаратор null-friendly, натурального порядка для строки.
     */
    public static Comparator<String> nullFirst() {
        Comparator<String> comparator = Comparator.nullsFirst(Comparator.naturalOrder());
        return comparator;
    }
}
