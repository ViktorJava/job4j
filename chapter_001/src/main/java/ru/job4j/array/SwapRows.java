package ru.job4j.array;

/**
 * 
 * <p>
 * Нужно переставить две строки в матрице, с учетом, что длины строк одинаковые.
 * src, dest это индексы строк.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 13.12.2020
 */
public class SwapRows {
    /**
     * Метод перестановки местами, двух строк двумерного массива,
     * одинаковой длинны.
     *
     * @param data Массив числовых данных.
     * @param src  Индекс строки-источника.
     * @param dst  Индекс строки-получателя.
     */
    public static void swap(int[][] data, int src, int dst) {
        int n = data[0].length;
        int[] buffer = new int[n];
        for (int i = 0; i < n; i++) {
            buffer[i] = data[src][i];
            data[src][i] = data[dst][i];
            data[dst][i] = buffer[i];
        }
    }
}
