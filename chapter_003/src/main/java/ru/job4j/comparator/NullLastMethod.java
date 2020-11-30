package ru.job4j.comparator;

import java.util.Comparator;

/**
 * Получение компаратора. Метод nullsLast().
 * Получить null-friendly компаратор для строки.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 30.11.2020
 */
public class NullLastMethod {
    /**
     * Метод получения естественного null-friendly компаратора для строк.
     *
     * @return null-friendly компаратор.
     */
    public static Comparator<String> nullLast() {
        return Comparator.nullsLast(Comparator.naturalOrder());
    }
}
