package ru.job4j.array;

/**
 * Двухмерный массив. Циклы.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 18.06.2021
 */
public class MatrixSum {
    /**
     * Метод рассчитывает сумму всех элементов целочисленного типа,
     * двумерного массива.
     *
     * @param array Двумерный массив целых числе.
     * @return Сумма элементов массива.
     */
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] i: array) {
            for (int j: i) {
                rsl += j;
            }
        }
        return rsl;
    }
}
