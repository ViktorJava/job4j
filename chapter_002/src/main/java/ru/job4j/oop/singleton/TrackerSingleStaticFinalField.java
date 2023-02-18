package ru.job4j.oop.singleton;

import ru.job4j.tracker.Item;

/**
 * static final field. Eager loading.
 * Этот вариант вариант похож на TrackerSingleStaticField.
 * Основное отличие, мы сразу создаем и инициализируем объект.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 03.01.2020
 */
public class TrackerSingleStaticFinalField {
    private static final TrackerSingleStaticFinalField INSTANCE =
            new TrackerSingleStaticFinalField();

    public TrackerSingleStaticFinalField() {
    }

    public static TrackerSingleStaticFinalField getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingleStaticFinalField trackerSingleStaticFinalField =
                TrackerSingleStaticFinalField.getInstance();
    }
}
