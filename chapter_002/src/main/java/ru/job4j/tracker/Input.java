package ru.job4j.tracker;

/**
 * Интерфейс определяет работу класса по получению данных от пользователя в консоли.
 * Введён для разрыва связей между классами зависящими от внешних рессурсов
 * (StartUI-Scanner). Этот интерфейс заменяет класс Scanner.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 02.12.2019
 */
public interface Input {
    /**
     * возвращает введённую строку от пользователя
     */
    String askStr(String question);

    /**
     * возвращает введённое число от пользователя
     */
    int askInt(String question);
}
