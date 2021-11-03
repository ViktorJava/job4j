package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * Индексы символов.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 02.11.2021
 */
public class Concordance {
    /**
     * Метод принимает строку, при этом слова могут содержать как строчные
     * символы, так и прописные. При реализации необходимо игнорировать
     * пробелы во входной строке.
     * <p>
     * Необходимо реализовать метод, который вернет отображение,
     * в котором ключом будет символ из строки, а значением - список индексов,
     * под которыми этот символ (если таких символов несколько) входит
     * в исходную строку. Важно: строчные и прописные символы считаются
     * разными символами.
     *
     * @param string Предложение.
     * @return Отображение с результатом.
     */
    public static Map<Character, List<Integer>> collectCharacters(String string) {
        Map<Character, List<Integer>> rsl = new HashMap<>();
        String word = string.replace(" ", "");
        IntStream.range(0, word.length()).forEach(i -> {
            rsl.putIfAbsent(word.charAt(i), new ArrayList<>());
            rsl.get(word.charAt(i)).add(i);
        });
        return rsl;
    }
}
