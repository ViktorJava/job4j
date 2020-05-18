package ru.job4j.tracker;

import java.util.Comparator;

/**
 * Компаратор, для модели данных ru.job4j.tracker.Item,
 * который сортирует данные по убыванию.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 19.05.2020
 */
public class NameSortDec implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return second.getName().compareTo(first.getName());
    }
}
