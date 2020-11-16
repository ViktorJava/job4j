package ru.job4j.array;

/**
 * Индексы в массивах.
 * Расставить значения индексов так, чтобы первый метод
 * возвращал первый элемент массива,
 * а второй метод - последний элемент массива.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 16.11.2020
 */
public class ArrayIndex {
    /**
     * Метод возвращает первый элемент массива.
     *
     * @param array Массив.
     * @return Первый элемент массива.
     */
    public static int getFirstElement(int[] array) {
        return array[0];
    }

    /**
     * Метод возвращает последний элемент массива.
     *
     * @param array Массив.
     * @return Последний элемент массива.
     */
    public static int getLastElement(int[] array) {
        return array[array.length - 1];
    }
}
