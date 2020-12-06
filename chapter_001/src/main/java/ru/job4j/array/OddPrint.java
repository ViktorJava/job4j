package ru.job4j.array;

/**
 * Вывести нечетные в порядке возрастания индексов.
 * <p>
 * Дан целочисленный массив размера N. Вывести все содержащиеся в данном
 * массиве нечетные числа в порядке возрастания их индексов.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 06.12.2020
 */
public class OddPrint {
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}
