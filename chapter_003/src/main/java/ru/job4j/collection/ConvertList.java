package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Конвертация листа массивов в один лист Integer.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 14.05.2020
 */
public class ConvertList {
    /**
     * Метод convert должен пройтись по всем элементам
     * всех массивов в списке list и добавить их в список rsl.
     * Массивы в списке list могут быть разного размера.
     *
     * @param list список содержащий массив чисел.
     * @return список чисел.
     */
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] row : list) {
            for (int cell : row) {
                rsl.add(cell);
            }
        }
        return rsl;
    }
}
