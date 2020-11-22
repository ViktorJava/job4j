package ru.job4j.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Буквы в алфавитном порядке.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 22.11.2020
 */
public class Alphabet {
    /**
     * Метод, принимает строку. Строка является, одним словом,
     * без знаков препинания цифр и пробелов.
     * Метод должен вернуть новую строку, в которой все символы
     * исходной строки будут расставлены в алфавитном порядке.
     *
     * @param s Строка, являющаяся, одним словом.
     * @return строка с отсортированными символами в алфавитном порядке.
     */
    public static String reformat(String s) {
        List<String> stringList = new ArrayList<>(Arrays.asList(s.split("")));
        Collections.sort(stringList);
        StringBuilder sb = new StringBuilder();
        for (String str : stringList) {
            sb.append(str);
        }
        return sb.toString();
    }
}
