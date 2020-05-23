package ru.job4j.collection;

import java.util.Comparator;

/**
 * Сортировка по возрастанию, по полю name.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 18.05.2020
 */
public class JobAscByName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
