package ru.job4j.stream.exercises;

import java.util.List;

/**
 * Промежуточные операции. Метод mapToInt(). Сумма кодов символов.
 * <p>
 * Преобразовать стрим Character в LongStream, т.е. в стрим кодов символов,
 * и получить сумму этих кодов.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 26.12.2020
 */
public class MapToIntMethod {
    /**
     * Метод преобразования стрима Character в сумму кодов этих символов.
     *
     * @param characters Character Список данных символьного типа.
     * @return Сумма кодов символов полученных на входе.
     */
    public static long sum(List<Character> characters) {
        return characters.stream()
                         .mapToLong(s -> (long) s)
                         .sum();
    }
}
