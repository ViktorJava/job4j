package ru.job4j.inheritance;

/**
 * Класс HTML отчёта.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 8/31/2021
 */
public class HtmlReport extends TextReport {

    /**
     * Метод генерации HTML отчёта.
     *
     * @param name Название отчета.
     * @param body Текст отчёта.
     * @return Отчёт.
     */
    @Override
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>"
                + "<br/>"
                + "<span>" + body + "</span>";
    }
}
