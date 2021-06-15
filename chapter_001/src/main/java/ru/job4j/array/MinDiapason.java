package ru.job4j.array;

/**
 * Поиск минимума в диапазоне.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 15.06.2021
 */
public class MinDiapason {
    /**
     * Метод поиска минимального значения элемента массива, в диапазоне.
     *
     * @param array  Массив.
     * @param start  Начало диапазона.
     * @param finish Конец диапазона.
     * @return Минимальное значение.
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i < finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
