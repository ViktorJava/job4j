package ru.job4j.collection;

/**
 * Модель.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/18/2021
 */
public class Task {
    private final String number;
    private final String description;

    public Task(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }
}
