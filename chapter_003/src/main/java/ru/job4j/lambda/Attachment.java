package ru.job4j.lambda;

/**
 * Модель данных, предназначенная для работы с лямбда-выражениями
 * через функциональный интерфейс Comparator.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 20.08.2020
 */
public class Attachment {
    private final String name;
    private final int size;

    public Attachment(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "{"
                + "name='" + name
                + '\'' + ", size="
                + size
                + '}';
    }
}
