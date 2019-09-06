package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 06.09.2019
 */
public class ArrayCharTest {

    /**
     * Тест программы на соответствие начала слова и искомой последовательности
     */
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] world = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsW(world, pref);
        assertThat(result, is(true));
    }

    /**
     * Тест программы на несоответствие начала слова и искомой последовательности
     */
    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] world = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsW(world, pref);
        assertThat(result, is(false));
    }
}