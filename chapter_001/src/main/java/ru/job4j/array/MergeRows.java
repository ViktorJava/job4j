package ru.job4j.array;

/**
 * Объединить строки квадратного массива.
 * <p>
 * Дана квадратная матрица. Необходимо объединить ее строки в один массив.
 * Например: {{1, 2}, {3, 4}} получить {1, 2, 3, 4}.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 13.12.2020
 */
public class MergeRows {
    /**
     * Метод преобразования квадратной матрицы в один массив.
     *
     * @param data Квадратная матрица целочисленного типа.
     * @return Массив данных целочисленного типа.
     */
    public static int[] merge(int[][] data) {
        int m = data.length;
        int n = data[0].length;
        int[] result = new int[m * n];
        int count = 0;
        for (int[] datum : data) {
            for (int j = 0; j < n; j++) {
                result[count++] = datum[j];
            }
        }
        return result;
    }
}
