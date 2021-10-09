package ru.job4j.array;

/**
 * <h2>Изменить элементы двумерного массива.</h2>
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10/9/2021
 */
public class EditorElementsArray {
    /**
     * Метод принимает двумерный массив произвольного размера,
     * в котором может быть сколько угодно рядов, а также произвольное
     * число элементов в ряду.
     * 1. Если элемент массива больше значения el - элемент массива нужно заменить
     * на разность между текущим значением элемента массива и значения el.
     * 2. Если элемент массива меньше или равен el - необходимо заменить
     * текущий элемент массива 0.
     *
     * @param array Двумерный целочисленный массив произвольного размера.
     * @param el    Любое целое число
     * @return Результирующий массив.
     */
    public static int[][] changeData(int[][] array, int el) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > el) {
                    array[i][j] = array[i][j] - el;
                } else {
                    if (array[i][j] <= el) {
                        array[i][j] = 0;
                    }
                }
            }
        }
        return array;
    }
}
