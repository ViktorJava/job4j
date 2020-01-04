package ru.job4j.oop.singleton;

import ru.job4j.tracker.Item;

/**
 * private static final class. Lazy loading.
 * Объект класса находиться в поле внутреннего класса.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 03.01.2020
 */
public class TrackerSingleStaticFinalClass {
    private TrackerSingleStaticFinalClass() {
    }

    public static TrackerSingleStaticFinalClass getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final TrackerSingleStaticFinalClass INSTANCE = new TrackerSingleStaticFinalClass();
    }

    public static void main(String[] args) {
        TrackerSingleStaticFinalClass tracker = TrackerSingleStaticFinalClass.getInstance();
    }
}
