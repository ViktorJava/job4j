package ru.job4j.stream.exercises;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Промежуточные операции. Метод limit().
 * <p>
 * Ваша задача взять первые 3 элемента из списка.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 17.12.2020
 */
public class LimitMethod {
    public static List<String> firstThree(List<String> strings) {
        return strings.stream()
                      .limit(3)
                      .collect(Collectors.toList());
    }
}
