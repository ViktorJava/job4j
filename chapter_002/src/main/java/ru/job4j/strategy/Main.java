package ru.job4j.strategy;

/**
 * Демонстрация создания шаблона стратегия на примере реализации доски
 * для рисования и загрузки в её форм (фигур).
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 16.11.2021
 */
public class Main {
    public static void main(String[] args) {
        Paint.draw(new Triangle());
        Paint.draw(new Square());
    }
}
