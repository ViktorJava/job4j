package ru.job4j.collection;

/**
 * Модель данных.
 * Этот класс имеет два поля: имя работы и приоритет исполнения.
 * Наша задача написать для него сортировку по возрастанию по полю priority,
 * а так же сделать сортировку по имени по возрастанию.
 * Для этого мы реализуем интерфейс Comparable.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 18.05.2020
 */
public class Job implements Comparable<Job> {
    private String name;
    private int priority;

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Job{"
                + "name='" + name + '\''
                + ", priority=" + priority
                + '}';
    }

    // Переопределение метода, класса Comparable.
    @Override
    public int compareTo(Job another) {
        return Integer.compare(priority, another.priority);
    }
}
