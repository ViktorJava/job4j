package ru.job4j.stream.exercises;

import java.util.stream.Stream;

/**
 * Создание стрима. Метод Stream.iterate().
 * <p>
 * Нужно написать метод, чтобы обход начиная с 0,
 * причем обходился бы только каждый второй элемент.
 * Например, для {1, 2, 3, 4} вывод должен быть 1 и 3.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 22.12.2020
 */
public class StreamIterate {
    /**
     * Метод обхода массива данных, типа Integer.
     *
     * @param data Массив данных, целочисленного типа.
     */
    public static void showArray(Integer[] data) {
        Stream.iterate(0, i -> i < data.length, i -> i + 2)
              .forEach(i -> System.out.println(data[i]));
    }
}
