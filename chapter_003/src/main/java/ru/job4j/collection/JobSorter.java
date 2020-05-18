package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Класс сортировки обобщённых данных типа Job.
 * Сортируем данные по приоритету.
 * Сортируем данные по имени через компаратор.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 18.05.2020
 */
public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1)
        );
        System.out.println(jobs); // Данные до сортировки.
        Collections.sort(jobs); // Сорировка по приоритету.
        System.out.println(jobs); // Данные после сортировки.
        Collections.sort(jobs, new SortByNameJob()); // Сортировка по имени через компаратор.
        System.out.println(jobs);
    }
}
