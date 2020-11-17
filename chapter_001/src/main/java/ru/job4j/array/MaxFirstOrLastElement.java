package ru.job4j.array;

/**
 * Максимум из первого и последнего элемента массива.
 * Необходимо реализовать метод, который принимает массив целочисленных
 * значений, сравнивает между собой первый и последний элемент
 * и возвращает максимальное из двух значений.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 17.11.2020
 */
public class MaxFirstOrLastElement {
    /**
     * Метод возвращает максимальное значение из первого
     * или последнего элементов.
     *
     * @param array Массив.
     * @return Максимальное значение.
     */
    public static int getMaxValue(int[] array) {
        int result = array[0];
        if (array[0] < array[array.length - 1]) {
            result = array[array.length - 1];
        }
        return result;
    }
}
