package ru.job4j.array;

/**
 * Одинаковые элементы для массивов.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 05.11.2020
 */
public class CrossArray {
    /**
     * Вывести на консоль числа, которые есть
     * одновременно в первом и втором массиве.
     *
     * @param left  Массив целых чисел.
     * @param right Массив целых чисел.
     */
    public static void printCrossEl(int[] left, int[] right) {
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    System.out.print(left[i] + System.lineSeparator());
                }
            }
        }
    }
}
