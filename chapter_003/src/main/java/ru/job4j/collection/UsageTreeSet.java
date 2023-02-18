package ru.job4j.collection;

import java.util.TreeSet;

/**
 * Использование TreeSet c применением Comparable.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 20.12.2020
 */
public class UsageTreeSet implements Comparable<Object> {
    private final String name;
    private final int number;

    public UsageTreeSet(String string, int num) {
        this.name = string;
        this.number = num;
    }

    /**
     * Сортировка по полю name а затем по полю number.
     */
    @Override
    public int compareTo(Object o) {
        UsageTreeSet entry = (UsageTreeSet) o;
        int result = name.compareTo(entry.name);
        if (result != 0) {
            return result;
        }
        result = number - entry.number;
        if (result != 0) {
            return result / Math.abs(result);
        }
        return 0;
    }

    /**
     * Интересная реализация toString.
     *
     * @return Форматированная строка.
     */
    @Override
    public String toString() {
        String template = "num= %d; str= '%s'";
        return String.format(template, number, name);
    }

    public static void main(String[] args) {
        TreeSet<UsageTreeSet> data = new TreeSet<>();
        data.add(new UsageTreeSet("Высшая школа", 135));
        data.add(new UsageTreeSet("Средняя школа", 678));
        data.add(new UsageTreeSet("Военная школа", 125));
        data.add(new UsageTreeSet("Музыкальная школа", 125));
        data.add(new UsageTreeSet("Музыкальная школа", 325));
        for (UsageTreeSet u : data) {
            System.out.println(u.toString());
        }
    }
}
