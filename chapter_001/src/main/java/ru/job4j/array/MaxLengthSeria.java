package ru.job4j.array;

/**
 * Максимальная длина неубывающей последовательности.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 26.11.2021
 */
public class MaxLengthSeria {
    /**
     * Метод ищет максимальную неубывающую последовательность в массиве
     * целочисленных чисел.
     *
     * @param array Массив целых чисел.
     * @return Размер максимальной неубывающей последовательности.
     */
    public static int find(int[] array) {
        int max = 1;
        int counter = 1;
        for (int i = 1; i < array.length; i++) {
            counter = array[i] >= array[i - 1] ? ++counter : 1;
            if (counter > max) {
                max = counter;
            }
        }
        return max;
    }
}
