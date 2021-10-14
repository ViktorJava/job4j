package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Панграмма.
 * Панграмма - короткий текст, который использует все буквы алфавита,
 * по возможности не повторяя их.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10/14/2021
 */
public class Pangram {
    /**
     * Метод принимает строку (на английском языке)
     * и определяет является ли входящая строка панграммой.
     * Строчные и прописные буквы являются одинаковыми символами,
     * пробелы необходимо игнорировать.
     *
     * @param s Входная строка.
     * @return true, когда входная строка является панграммой, иначе false.
     */
    public static boolean checkString(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.toLowerCase().charAt(i);
            if (c != 32) {
                set.add(c);
            }
        }
        return set.size() == 26;
    }
}
