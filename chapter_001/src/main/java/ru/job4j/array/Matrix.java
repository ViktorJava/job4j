package ru.job4j.array;

/**
 * ТЗ [#173371]: 6.6. Двухмерный массив. Таблица умножения.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 12.09.2019
 */
public class Matrix {

    /**
     * Метод реализующий таблицу умножения
     *
     * @param size размер таблицы
     * @return таблица
     */
    public int[][] multiple(int size) {
        int table[][] = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[j][i] = (j + 1) * (i + 1);
            }
        }
        return table;
    }
}
