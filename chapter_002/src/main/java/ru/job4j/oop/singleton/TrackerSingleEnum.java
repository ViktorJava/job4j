package ru.job4j.oop.singleton;

import ru.job4j.tracker.Item;

/**
 * enum. Eager loading.
 * Энергичная загрузка (Eager loading) - загружает объект сразу после старта
 * виртуальной машины.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 03.01.2020
 */
public enum TrackerSingleEnum {
    INSTANCE;

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingleEnum trackerSingleEnum = TrackerSingleEnum.INSTANCE;
    }
}
