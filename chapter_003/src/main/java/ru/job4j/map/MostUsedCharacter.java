package ru.job4j.map;

import java.util.TreeMap;

/**
 * Найти символ который используется в строке наибольшее количество раз.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10/29/2021
 */
public class MostUsedCharacter {
    /**
     * Метод принимает строку, которая может содержать несколько пробелов,
     * однако в ней отсутствуют знаки препинания.
     * Необходимо реализовать метод, который вернет символ в строке,
     * который употребляется наибольшее количество раз.
     * Если окажется что таких символов несколько
     * - необходимо вернуть первый из символов.
     *
     * @param str Строка с текстом.
     * @return Символ с максимальной частотой.
     */
    public static char getMaxCount(String str) {
        char rsl = ' ';
        String s = str.replace(" ", "").toLowerCase();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.computeIfPresent(s.charAt(i), (k, v) -> v + 1);
            map.putIfAbsent(s.charAt(i), 1);
        }
        Integer max = 0;
        for (Character chr: map.keySet()) {
            if (map.get(chr) > max) {
                max = map.get(chr);
                rsl = chr;
            }
        }
        return rsl;
    }
}
