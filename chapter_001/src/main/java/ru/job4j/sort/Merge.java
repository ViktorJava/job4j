package ru.job4j.sort;

import java.util.Arrays;

/**
 * ТЗ[#124482]:Даны два отсортированных массива.Нужно написать метод,
 * который берет элементы этих массивов и добавляет в третий массив.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 16.10.2019
 */
public class Merge {
    /**
     * Метод объеденяет данные из двух отсортированных массивов и помещает в третий массив
     *
     * @param left  первый отсортированный массив
     * @param right второй отсортированный массив
     * @return третий отсортированный массив из первого и второго массивов
     */
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];

        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(new int[]{1, 3, 5}, new int[]{2, 4});
        System.out.println(Arrays.toString(rsl));
    }
}
