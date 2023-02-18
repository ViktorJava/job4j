package ru.job4j.stream.exercises;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Группировка элементов и подсчет количества. Метод counting().
 * <p>
 * Подсчитать количество работников для каждой компании.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 20.12.2020
 */
public class CountingMethod {
    public static class Company {
        private String name;

        public Company(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Worker {
        private int age;
        private Company company;

        public Worker(int age, Company company) {
            this.age = age;
            this.company = company;
        }

        public Company getCompany() {
            return company;
        }
    }

    /**
     * Метод группировки элементов и подсчёта количества.
     *
     * @param workers Список сотрудников.
     * @return Отображение с количеством работников в каждой компании.
     */
    public static Map<String, Long> groupAndCount(List<Worker> workers) {
        Function<Worker, String> convert = (s) -> s.getCompany()
                .getName();
        return workers.stream()
                .collect(Collectors.groupingBy(convert, Collectors.counting()));
    }
}
