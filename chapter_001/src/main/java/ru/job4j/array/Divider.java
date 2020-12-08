package ru.job4j.array;

/**
 * Кратность числа.
 * <p>
 * Метод принимает два параметра:
 * 1. Целочисленное значение num;
 * 2. Массив целочисленных значений ints.
 * Необходимо проверить являются ли все элементы массива ints, делителями
 * числа num, если являются - то метод должен вернуть true.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 08.12.2020
 */
public class Divider {
    /**
     * Метод проверяет, являются ли все элементы массива, делителями заданного
     * числа.
     *
     * @param num  Заданное число.
     * @param ints Массив целых чисел.
     * @return true в случае, когда заданное число является делимым,
     * иначе false.
     */
    public static boolean check(int num, int[] ints) {
        for (int anInt : ints) {
            if (num % anInt != 0) {
                return false;
            }
        }
        return true;
    }
}
