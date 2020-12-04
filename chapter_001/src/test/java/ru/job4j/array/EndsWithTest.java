package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 06.09.2019
 */
public class EndsWithTest {

    /**
     * Тест программы на соответствие окончания слова и искомой последовательности
     */
    @Test
    public void whenFinishedWithPostfixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o' };
        char[] post = {'l', 'l', 'o' };
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    /**
     * Тест программы на несоответствие окончания слова и искомой последовательности
     */
    @Test
    public void whenNotFinishedWithPostfixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o' };
        char[] post = {'l', 'l', 'i' };
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
}
