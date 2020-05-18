package ru.job4j.collection;

import java.util.Comparator;

/**
 * Класс сортировки обобщённых данных типа Job, по имени,
 * реализовующий интерфейс Comparator.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 18.05.2020
 */
public class SortByNameJob implements Comparator<Job> {

    @Override
    public int compare(Job first, Job second) {
        return first.getName().compareTo(second.getName());
    }
}
