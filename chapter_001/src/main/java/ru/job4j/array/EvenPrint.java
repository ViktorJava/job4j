package ru.job4j.array;

/**
 * Вывести четные числа в порядке убывания индексов.
 * <p>
 * Дан целочисленный массив размера N. Вывести все содержащиеся в данном
 * массиве четные числа в порядке убывания их индексов.
 * Например, для {1, 2, 3, 4} вывести 4, 2
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 06.12.2020
 */
public class EvenPrint {
    public static void print(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
