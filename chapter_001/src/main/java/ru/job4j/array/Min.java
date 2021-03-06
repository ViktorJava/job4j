package ru.job4j.array;

/**
 * Поиск минимального числа в массиве.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 15.06.2021
 */
public class Min {
    /**
     * Метод поиска минимального значения массива.
     *
     * @param array Массив.
     * @return Минимальное значение массива.
     */
    public static int findMin(int[] array) {
        var min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
