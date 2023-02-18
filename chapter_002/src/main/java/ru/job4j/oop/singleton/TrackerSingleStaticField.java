package ru.job4j.oop.singleton;

import ru.job4j.tracker.Item;

/**
 * static field. Lazy loading.
 * Ленивая загрузка (Lazy loading) происходит, когда мы явно обращаемся к объекту.
 * Происходит его загрузка.
 * Для того, чтобы закрыть возможность создавать экземпляр класса,
 * нам нужно явно создать конструктор по умолчанию и присвоить ему модификатор private.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 03.01.2020
 */
public class TrackerSingleStaticField {
    private static TrackerSingleStaticField instance;

    private TrackerSingleStaticField() {
    }

    /**
     * При вызове метода, проверяется статическое поле instance,
     * если поле не загружено, оно инициализируется новосозданным объектом.
     *
     * @return созданный объект.
     */
    public static TrackerSingleStaticField getInstance() {
        if (instance == null) {
            instance = new TrackerSingleStaticField();
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }
}
