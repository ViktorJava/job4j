package ru.job4j.collection;

import java.util.Comparator;

/**
 * Сортировка по возрастанию, по полю priority.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 22.05.2020
 */
public class JobAscByPriority implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o1.getPriority(), o2.getPriority());
    }
}
