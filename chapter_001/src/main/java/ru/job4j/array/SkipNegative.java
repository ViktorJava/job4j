package ru.job4j.array;

/**
 * Двухмерный массив. If. [#306727].
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 8/25/2021
 */
public class SkipNegative {
    /**
     * Метод должен заменить отрицательные значения в массиве на ноль.
     *
     * @param array Произвольный массив.
     * @return Результирующий массив.
     */
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                if (array[row][cell] < 0) {
                    array[row][cell] = 0;
                }
            }
        }
        return array;
    }
}
