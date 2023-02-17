package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Необходимо реализовать обратную конвертацию
 * двухмерного массива в одномерный список.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 14.05.2020
 */
public class ConvertMatrix2List {
    /**
     * Метод toList - принимает двухмерный массив array.
     * Проходим по всем элементам этого массива и добавляем
     * его в одномерный список list.
     *
     * @param array двумерный массив.
     * @return список.
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }
}
