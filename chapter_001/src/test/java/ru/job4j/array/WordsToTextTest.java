package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Тест преобразования массива слов в строку.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 11.12.2020
 */
public class WordsToTextTest {
    @Test
    public void test() {
        assertEquals("Hello World", WordsToText.convert(new String[]{"Hello", "World"}));
        assertEquals("one two three", WordsToText.convert(new String[]{"one", "two", "three"}));
        assertEquals("one", WordsToText.convert(new String[]{"one"}));
    }
}
