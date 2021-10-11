package ru.job4j.stream;

import java.util.Arrays;

/**
 * Промежуточные операции. Метод flatMapToInt(). Сумма чисел матрицы.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10/11/2021
 */
public class FlatMapForPrimitive {
    /**
     * Метод принимает массив чисел и возвращает сумму элементов матрицы.
     *
     * @param matrix Массив чисел.
     * @return Сумма элементов матрицы.
     */
    public static int sum(int[][] matrix) {
        return Arrays.stream(matrix).flatMapToInt(Arrays::stream).sum();
    }
}
