package ru.job4j.ex;

/**
 * Собственный класс исключения.
 * Пользовательское исключение.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 07.01.2020
 */
public class ElementNotFoundException extends Exception {
    public ElementNotFoundException(String message) {
        super(message);
    }
}