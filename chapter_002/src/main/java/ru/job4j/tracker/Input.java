package ru.job4j.tracker;

/**
 * Интерфейс определяет работу класса
 * получения данных в консоли, от пользователя.
 * Введён для разрыва связей между классами
 * зависящими от внешних рессурсов.
 * (StartUI-Scanner).
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 02.12.2019
 */
public interface Input {
    /**
     * Возвращает введённую строку.
     *
     * @param question запрос ввода данных.
     * @return введённые данные.
     */
    String askStr(String question);

    /**
     * Возвращает введённое число.
     *
     * @param question запрос ввода данных.
     * @return введённые данные.
     */
    int askInt(String question);

    /**
     * Возвращает введённое число в заданном диапазоне.
     *
     * @param question запрос ввода данных.
     * @param max      максимальное значение даипозона.
     * @return введённые данные.
     */
    int askInt(String question, int max);

}