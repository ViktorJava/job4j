package ru.job4j.array;

/**
 * Переставить местами элементы массива.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 13.06.2021
 */
public class SwitchArray {
    /**
     * Метод меняет местами произвольные элементы.
     *
     * @param array  Массив целых чисел.
     * @param source Источник.
     * @param dest   Получатель.
     * @return Результирующий массив.
     */
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    /**
     * Метод меняет местами нулевой и последний элементы в массиве.
     *
     * @param array Массив целых чисел.
     * @return Результирующий массив.
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index: rsl) {
            System.out.println(index);
        }
    }
}
