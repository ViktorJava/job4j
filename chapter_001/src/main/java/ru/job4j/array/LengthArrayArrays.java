package ru.job4j.array;

/**
 * Размер элемента двухмерного массива. [#333583]
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 8/25/2021
 */
public class LengthArrayArrays {
    /**
     * Создайте двумерный массив и сразу его заполните.
     * Только с некоторыми оговорками - внутри должно быть 4 массива,
     * при этом в первом - 1 элемент, во втором - 2, третьем - 3, четвертом - 4.
     * Выведите в консоль размер каждого вложенного массива.
     *
     * @param args Аргументы.
     */
    public static void main(String[] args) {
        int[][] numbers = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[i].length
            );
        }
    }
}
