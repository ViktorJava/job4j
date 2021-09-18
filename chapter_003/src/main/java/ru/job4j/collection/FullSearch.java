package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * Уникальные задачи. [#212653]
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/18/2021
 */
public class FullSearch {
    /**
     * Метод убирает дубликаты в списке значений типа Task.
     *
     * @param list Список значений типа Task.
     * @return Множество значений типа String.
     */
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task task: list) {
            numbers.add(task.getNumber());
        }
        return numbers;
    }
}
