package ru.job4j.array;

/**
 * Проверить сортировку массива.
 * Задана числовой массив. Необходимо написать программу,
 * которая проверит, что массив отсортирован по возрастанию.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 04.11.2020
 */
public class Sorted {
    /**
     * Метод проверки массива целых чисел,
     * на сортировку по возрастанию.
     *
     * @param array Массив целых чисел.
     * @return true в случае отсортированного массива,
     * иначе false.
     */
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
