package ru.job4j.stream;

import java.util.stream.Stream;

/**
 * Терминальные операции. Метод forEach().
 * <p>
 * Вывести элементы стрима в консоль через System.out.println().
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 23.12.2020
 */
public class ForEachMethod {
    /**
     * Метод вывода на консоль элементов стрима.
     *
     * @param data Integer Стрим элементов целочисленного типа.
     */
    public static void show(Stream<Integer> data) {
        data.forEach(System.out::println);
    }
}
