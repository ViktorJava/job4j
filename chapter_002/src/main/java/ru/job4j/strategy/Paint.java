package ru.job4j.strategy;

/**
 * Демонстрация создание шаблона: стратегия,
 * на примере реализации доски для рисования
 * и загрузки в них форм.
 * Класс Paint - описывает общее поведение системы.
 * Это и есть Context.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10.12.2019
 */
public class Paint {
    public static void main(String[] args) {
        draw(new Triangle());
        draw(new Square());
    }
    public static void draw(Shape shape) {
        System.out.println(shape.draw());
    }
}