package ru.job4j.array;

/**
 * ТЗ [#173379]: 6.2. Перевернуть массив.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 06.09.2019
 */
public class Turn {

    /**
     * Метод должен перевернуть массив задом наперёд
     *
     * @param array массив для переворачивания
     * @return перевёрнутый массив
     */
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1]; //нифига себе конструкция :-)
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
