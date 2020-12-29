package ru.job4j.set;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тесты проверки слова, является ли оно изограммой.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 29.12.2020
 */
public class IsogramTest {
    @Test
    public void checkStringTrue() {
        String input = "uncopyrightables";
        boolean result = Isogram.sheckString(input);
        assertThat(result, is(true));
    }

    @Test
    public void checkedStringFalse() {
        String input = "javascript";
        boolean result = Isogram.sheckString(input);
        assertThat(result, is(false));
    }
}
