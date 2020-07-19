package ru.job4j.collection;

import java.util.Arrays;

/**
 * Даны две строки. Нужно проверить, что вторая строка получилась
 * методом перестановки символов первой строки.
 * Из задания следует, что для проверки равенства строк,
 * необходимо отсортировать символы строк.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 18.07.2020
 */
public class FreezeStr {
    /**
     * Читерский метод сравнения строк.
     *
     * @param left  Первая строка.
     * @param right Вторая строка.
     * @return true если вторая строка получилась
     * методом перестановки символов первой строки,
     * иначе false.
     */
    public static boolean eq(String left, String right) {
        // Строки разные если их длинна разная.
        if (left.length() != right.length()) {
            return false;
        }
        char[] charArrayLeft = left.toCharArray();
        char[] charArrayRight = right.toCharArray();
        Arrays.sort(charArrayLeft);
        Arrays.sort(charArrayRight);
        return Arrays.equals(charArrayLeft, charArrayRight);
    }
}
