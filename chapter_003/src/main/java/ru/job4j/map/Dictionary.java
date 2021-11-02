package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Реализовать словарь.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 02.11.2021
 */
public final class Dictionary {
    private Dictionary() {
    }

    /**
     * Необходимо реализовать словарь. Метод принимает массив строк.
     * Необходимо перебрать массив и добавить строки в карту таким образом,
     * чтобы ключом был первый символ строки, а значением - список строк,
     * которые начинаются на первый символ строки.
     *
     * @param strings Массив строк.
     * @return Отображение словаря.
     */
    public static Map<String, List<String>> collectData(
            final String[] strings
    ) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String string: strings) {
            String ch = String.valueOf(string.charAt(0));
            rsl.putIfAbsent(ch, new ArrayList<>());
            rsl.get(ch).add(string);
        }
        return rsl;
    }
}
