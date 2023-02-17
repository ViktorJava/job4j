package ru.job4j.oop.singleton;

/**
 * Экспериментальный класс инициализации элементов класса.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 03.01.2020
 */
public class LoadOrder {
    private static String staticField = echo("static field");

    private static final String STATIC_FINAL_FIELD = echo("static final field");

    static {
        echo("static block");
    }

    {
        echo("non static block");
    }

    private String surname = echo("normal field");

    private final String field = echo("final field");

    public LoadOrder(String text) {
        echo("constructor " + text);
    }

    public static String echo(String text) {
        System.out.println(text);
        return text;
    }

    private static final class Holder {
        private static final LoadOrder INSTANCE = new LoadOrder("static inner field");
    }

    public static void main(String... args) {
        LoadOrder order = new LoadOrder("main");
    }
}
