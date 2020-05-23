package ru.job4j.collection;

/**
 * Модель данных.
 * Этот класс имеет два поля: имя работы и приоритет исполнения.
 * Наша задача написать для него сортировку по возрастанию и убыванию,
 * по полю priority, а так же по полю name.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 18.05.2020
 */
public class Job {
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
        return String.format("Job{name='%s', priority=%02d}", name, priority);
    }
}
