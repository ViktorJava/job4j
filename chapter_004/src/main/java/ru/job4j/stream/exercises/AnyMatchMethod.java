package ru.job4j.stream.exercises;

import java.util.List;

/**
 * Терминальные операции. Метод anyMatch().
 * <p>
 * Проверить, что хотя бы одна строка списка строк, начинается с "job4j"
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 23.12.2020
 */
public class AnyMatchMethod {
    /**
     * Метод проверки что хотя бы одна строка начинается на "job4j".
     *
     * @param data String список строк.
     * @return boolean true в том случае, если хотя бы одна строка начинается
     * на "job4j" иначе false.
     */
    public static boolean check(List<String> data) {
        return data.stream()
                   .anyMatch(s -> s.startsWith("job4j"));
    }
}
