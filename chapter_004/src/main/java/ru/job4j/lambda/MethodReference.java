package ru.job4j.lambda;

import java.util.function.Consumer;

/**
 * Method reference. Обращение через класс и объект.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 12.10.2020
 */
public class MethodReference {
    /**
     * Обращение к методу, через объект класса.
     */
    public void applyByInstance() {
        Consumer<String> consumer = this::consumerByInstance;
        consumer.accept("Hello");
    }

    /**
     * Обращение к методу через имя класса.
     */
    public static void applyByClass() {
        Consumer<String> consumer = MethodReference::consumerByClass;
        consumer.accept("Hello");
    }

    private void consumerByInstance(String input) {
        System.out.print("From instance: " + input);
    }

    private static void consumerByClass(String input) {
        System.out.print("From class: " + input);
    }
}
