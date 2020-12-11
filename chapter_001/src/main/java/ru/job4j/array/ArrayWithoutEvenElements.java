package ru.job4j.array;

import java.util.Arrays;

/**
 * Массив без четных значений.
 * <p>
 * Метод принимает массив целочисленных значений. Необходимо перебрать этот
 * массив выбрать из него только нечетные числа и вернуть новый массив,
 * в котором будут только нечетные числа. При этом длина нового массива должна
 * совпадать с количеством нечетных значений в исходном массиве.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 11.12.2020
 */
public class ArrayWithoutEvenElements {
    /**
     * Метод возвращает массив нечётных чисел.
     *
     * @param data Массив чисел.
     * @return Массив нечётных чисел.
     */
    public static int[] changeData(int[] data) {
        int[] array = new int[data.length];
        int count = 0;
        for (int number : data) {
            if (number % 2 != 0) {
                array[count++] = number;
            }
        }
        return Arrays.copyOf(array, count);
    }
}
