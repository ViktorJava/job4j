package ru.job4j.stream.exercises;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Удалить из числового списка все элементы, кратные 4.
 * <p>
 * Дан исходный список. Получить список без элементов,
 * кратных 4, из исходного списка.
 * Например: {1, 2, 3, 4, 5, 8} -> {1, 2, 3, 5}
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 17.12.2020
 */
public class Task1 {
    /**
     * Метод удаляет из списка чисел, элементы кратные 4.
     *
     * @param data Список чисел.
     * @return Список чисел с удалёнными значениями кратными 4.
     */
    public static List<Integer> retain(List<Integer> data) {
        return data.stream()
                   .filter(n -> n % 4 != 0)
                   .collect(Collectors.toList());
    }
}
