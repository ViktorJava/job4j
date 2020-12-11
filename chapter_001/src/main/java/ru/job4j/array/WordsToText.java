package ru.job4j.array;

/**
 * Объединение слов.
 * <p>
 * Дан массив слов, необходимо получить текст из этих слов, разделенных пробелом.
 * Например: {"one", "two", "three"} => "one two three"
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 11.12.2020
 */
public class WordsToText {
    /**
     * Метод преобразования массива слов в строку.
     *
     * @param words Массив слов.
     * @return Строка.
     */
    public static String convert(String[] words) {
        String result = "";
        for (String word : words) {
            result += String.format("%s ", word);
        }
        return result.trim();
    }
}
