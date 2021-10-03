package ru.job4j.comparator;

import java.util.Comparator;

/**
 * Сортировка номера [#221284]
 * На вход компаратора подаются строки вида: 10. Task.
 * Компаратор LexSort должен сравнивать номер, а не целиком строку.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10/3/2021
 */
public class LexSort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] left = o1.split(". ");
        String[] right = o2.split(". ");
        Integer intLeft = Integer.parseInt(left[0]);
        Integer intRight = Integer.parseInt(right[0]);
        return intLeft.compareTo(intRight);
    }
}
