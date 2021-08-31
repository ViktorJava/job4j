package ru.job4j.inheritance;

/**
 * Класс JSON отчёта.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 8/31/2021
 */
public class JSONReport extends TextReport {

    /**
     * Метод генерации JSON отчёта.
     *
     * @param name Название отчета.
     * @param body Текст отчёта.
     * @return Отчёт.
     */
    @Override
    public String generate(String name, String body) {
        String sls = System.lineSeparator();
        return "{" + sls
                + "\"name\" : " + name + sls
                + "\"body\" : " + body + sls
                + "}";
    }
}
