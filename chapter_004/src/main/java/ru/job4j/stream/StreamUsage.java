package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Необходимо создать ArrayList. Заполните его числами Integer.
 * Получить из ArrayList поток данных.
 * Отфильтруйте поток так, чтобы в нем остались только положительные числа.
 * Отфильтрованный поток записать в List.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 13.10.2020
 */
public class StreamUsage {
    /**
     * Фильтр потока чисел, чтобы в нем остались только положительные числа.
     *
     * @param list Перечень положительных и отрицательных чисел.
     * @return Список положительных чисел.
     */
    public List<Integer> pNumber(ArrayList<Integer> list) {
        List<Integer> numbers = list.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
        return numbers;
    }
}
