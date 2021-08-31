package ru.job4j.inheritance;

/**
 * Класс текстового отчёта.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 8/31/2021
 */
public class TextReport {
    /**
     * Метод генерации текстового отчёта.
     *
     * @param name Название отчета.
     * @param body Текст отчёта.
     * @return Отчёт.
     */
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}
