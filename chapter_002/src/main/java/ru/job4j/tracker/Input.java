package ru.job4j.tracker;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 02.12.2019
 */
public interface Input {
    String askStr(String question);

    int askInt(String question);
}
