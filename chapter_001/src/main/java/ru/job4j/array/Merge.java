package ru.job4j.array;

import java.util.Arrays;

/**
 * Объединить два отсортированных массива.
 * ТЗ[#124482]:Даны два отсортированных массива.Нужно написать метод,
 * который берет элементы этих массивов и добавляет в третий массив.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 16.10.2019
 */
public class Merge {
    /**
     * Метод объединяет данные из двух отсортированных
     * массивов и помещает в третий массив.
     *
     * @param left  Первый отсортированный массив.
     * @param right Второй отсортированный массив.
     * @return третий отсортированный массив состоит из
     * первого и второго массивов.
     */
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int counter1 = 0;
        int counter2 = 0;
        int rslIndex = 0;
        while (counter1 + counter2 != rsl.length) {
            if (counter1 != left.length && counter2 != right.length) {
                rsl[rslIndex++] = left[counter1] < right[counter2]
                        ? left[counter1++] : right[counter2++];
            } else if (counter1 != left.length) {
                rsl[rslIndex++] = left[counter1++];
            } else {
                rsl[rslIndex++] = right[counter2++];
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(new int[]{1, 3, 5}, new int[]{2, 4});
        System.out.println(Arrays.toString(rsl));
    }
}
