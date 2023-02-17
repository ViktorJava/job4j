package ru.job4j.collection;

import java.util.List;

/**
 * Конвертация {@code ArrayList} в двумерный массив.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 14.05.2020
 */
public class ConvertList2Array {
    /**
     * Метод получает на вход список чисел и количество ячеек
     * в строке. На выходе, получаем двумерный массив типа int,
     * с расчётным количеством строк. В процессе расчёта
     * необходимого массива, возникает дефицит элементов,
     * который компенсируется нулями.
     *
     * @param list  список чисел.
     * @param cells колличество ячеек в строке.
     * @return двумерный массив типа int.
     */
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            array[row][cell] = num;
            cell++;
            if (cell == cells) {
                cell = 0;
                row++;
            }
        }
        return array;
    }
}
