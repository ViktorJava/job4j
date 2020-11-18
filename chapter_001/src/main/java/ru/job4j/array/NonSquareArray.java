package ru.job4j.array;

/**
 * Создание неоднородного двумерного массива.
 * Заполнить массив значениями от 1 до 6, при этом:
 * 1. Разбить значения на 3 массива.
 * 2. В первом должен быть 1 элемент, втором - 2 элемента,
 * третьем - 3 элемента.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 18.11.2020
 */
public class NonSquareArray {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1}, {2, 3}, {4, 5, 6}};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].length);
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
