package ru.job4j.collection;

import java.util.Comparator;

/**
 * Сортировка по убыванию, по полю name.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 22.05.2020
 */
public class JobDescByName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
