package ru.job4j.tracker;

import java.util.Comparator;

/**
 * Компаратор, для модели данных ru.job4j.tracker.Item,
 * который сортирует данные по возрастанию.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 19.05.2020
 */
public class NameSortInc implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return first.getName().compareTo(second.getName());
    }
}
