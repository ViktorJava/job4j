package ru.job4j.array;

/**
 * Размер двумерного массива.
 * Необходимо реализовать 2 метода - первый возвращает размер массива,
 * второй - количество элементов в ряду, номер которого мы передаем в метод.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 17.11.2020
 */
public class Board {
    /**
     * Метод возвращает размер двумерного массива (кол-во рядов).
     *
     * @param array Двумерный массив.
     * @return Размер массива (кол-во рядов).
     */
    public static int getCountRow(int[][] array) {
        return array.length;
    }

    /**
     * Метод возвращает кол-во элементов в ряду, номер которого
     * передаётся в метод.
     *
     * @param array Двумерный массив.
     * @param row   Номер ряда.
     * @return Кол-во элементов в заданном ряду.
     */
    public static int getCountCellInRow(int[][] array, int row) {
        return array[row].length;
    }
}
