package ru.job4j.array;

/**
 * Проверить является ли двумерный массив квадратным.
 * Проверить является ли входящий двумерный массив квадратным
 * (т.е. количество элементов в каждом ряду,
 * должно совпадать с количеством рядов).
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 18.11.2020
 */
public class CheckSquareArray {
    /**
     * Метод проверяет, является ли входящий двумерный массив квадратным.
     *
     * @param array Входящий двумерный массив.
     * @return Если массив квадратный: true иначе false.
     */
    public static boolean checkArray(int[][] array) {
        boolean rsl = true;
        int standard = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != standard) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
