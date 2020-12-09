package ru.job4j.array;

/**
 * Сумма элементов массива - четное число?
 * <p>
 * Метод принимает массив целочисленных значений. Метод должен определить сумму
 * всех элементов в массиве, проверить значение суммы является ли оно
 * четным числом.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 09.12.2020
 */
public class EvenSumElements {
    /**
     * Метод проверки чётности суммы значений массива.
     *
     * @param data Массив чисел.
     * @return true в случае четности суммы чисел, иначе false.
     */
    public static boolean checkArray(int[] data) {
        int sum = 0;
        for (int datum : data) {
            sum += datum;
        }
        return sum % 2 == 0;
    }
}
