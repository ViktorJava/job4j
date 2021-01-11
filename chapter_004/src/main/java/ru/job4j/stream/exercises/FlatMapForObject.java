package ru.job4j.stream.exercises;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <h2>5.8. Промежуточные операции. Метод flatMap()</h2>
 * Элементы вложенных списков собрать в один список.
 * Применение {@code flatMap()}.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 09.01.2021
 */
public class FlatMapForObject {
    /**
     * Метод сбора в один список элементов вложенных списков.
     *
     * @param lists Вложенные списки с элементами целочисленного типа.
     * @return Список из элементов собранных из вложенных списков.
     */
    public static List<Integer> flatMap(List<List<Integer>> lists) {
        return lists.stream()
                    .flatMap(subList -> subList.stream())
                    .collect(Collectors.toList());
    }
}
