package ru.job4j.array;

/**
 * Кодировщик.
 * Нам необходимо зашифровать данные(массив целочисленных значений)
 * поместив закодированные в результирующий массив целочисленных значений.
 * При этом метод принимает 2 параметра:
 * 1. Исходный массив целочисленных значений;
 * 2. Число на кратность которому мы будем проверять каждое значение в массиве.
 * При этом в результирующий массив должен быть помещен остаток от деления
 * каждого элемента массива на второй аргумент реализуемого метода.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10/5/2021
 */
public class Decoding {
    /**
     * Метод шифрует данные массива.
     *
     * @param ints   Исходный массив целочисленных значений.
     * @param number Число на кратность которому мы будем проверять каждое
     *               значение в массиве.
     * @return Результирующий массив.
     */
    public static int[] decode(int[] ints, int number) {
        int[] rsl = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            rsl[i] = ints[i] % number;
        }
        return rsl;
    }
}
