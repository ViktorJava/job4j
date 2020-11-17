package ru.job4j.array;

/**
 * Индекс максимального значения.
 * Метод должен вернуть индекс элемента, который является максимальным из двух:
 * первый элемент и последний элемент.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 17.11.2020
 */
public class IndexMaxElement {
    /**
     * Метод возвращает максимальный из двух элементов массива: первый или
     * последний элемент.
     *
     * @param array Массив.
     * @return Максимальный элемент.
     */
    public static int getIndexMax(int[] array) {
        int result = array[0] > array[array.length - 1] ? 0 : array.length - 1;
        return result;
    }
}
