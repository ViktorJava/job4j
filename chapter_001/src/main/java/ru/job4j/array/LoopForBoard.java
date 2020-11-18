package ru.job4j.array;

/**
 * Доступ к элементам в двумерном массиве.
 * Класс печатает элементы массива, при этом он должен пропустить
 * в каждом ряду первый и последний элемент.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 18.11.2020
 */
public class LoopForBoard {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}};
        for (int[] ints : array) {
            for (int j = 1; j < ints.length - 1; j++) {
                System.out.println(ints[j]);
            }
        }
    }
}
