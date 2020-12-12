package ru.job4j.array;

import java.util.Arrays;

/**
 * Транспонировать матрицу.
 * <p>
 * Транспонирование матрицы, это когда строки исходной матрицы, становятся
 * столбцами в результирующей матрице.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 12.12.2020
 */
public class Transposition {
    /**
     * Метод транспонирования матрицы.
     *
     * @param matrix Исходная матрица.
     * @return Транспонированная матрица.
     */
    public static int[][] convert(int[][] matrix) {
        int n = matrix.length; //сколько строк
        int m = matrix[0].length; //длинна строки
        int[][] result = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        System.out.println(Arrays.deepToString(result));
        return result;
    }
}
