package ru.job4j.array;

/**
 * Размер массива.
 * Даны 2 массива чисел. Необходимо определить общий размер массива
 * при их объединении. В этом задании объединять ничего не нужно,
 * Необходимо только определить общий размер результирующего массива.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 16.11.2020
 */
public class ConcatArray {
    /**
     * Метод определяющий общий размер двух массивов.
     *
     * @param a Массив чисел.
     * @param b Массив чисел.
     * @return Общий разер двух массивов.
     */
    public static int combineSize(int[] a, int[] b) {
        return a.length + b.length;
    }
}
