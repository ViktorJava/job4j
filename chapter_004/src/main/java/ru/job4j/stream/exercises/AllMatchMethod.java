package ru.job4j.stream.exercises;

import java.util.List;

/**
 * Терминальные операции. Метод allMatch().
 * <p>
 * Необходимо проверить, что переданный список содержит строки длина,
 * которых больше 3.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 23.12.2020
 */
public class AllMatchMethod {
    /**
     * Метод проверки, что длинна строк списка больше трёх символов.
     *
     * @param data String Список строк.
     * @return boolean true в том случае, когда длинна всех строк в списке
     * больше 3 символов, иначе false.
     */
    public static boolean chec(List<String> data) {
        return data.stream()
                   .allMatch(s -> s.length() > 3);
    }
}
