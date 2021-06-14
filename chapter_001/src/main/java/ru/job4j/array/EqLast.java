package ru.job4j.array;

/**
 * Сравнить последние элементы двух массивов.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 14.06.2021
 */
public class EqLast {
    /**
     * Метод сравнивает последние элементы двух массивов.
     *
     * @param left  Первый массив.
     * @param right Второй массив.
     * @return true в случае равенства последних элементов двух массивов,
     * иначе false.
     */
    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];
    }
}
