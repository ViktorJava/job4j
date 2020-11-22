package ru.job4j.list;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Тест метода, расставляющего буквы слова в алфавитном порядке.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 22.11.2020
 */
public class AlphabetTest {
    @Test
    public void reformat() {
        String result = Alphabet.reformat("javascript");
        String expected = "aacijprstv";
        assertThat(result, is(expected));
    }

    @Test
    public void reformat1() {
        String rsl = Alphabet.reformat("websecurityconfigureradapter");
        String expected = "aabccdeeeefgiinoprrrrsttuuwy";
        assertThat(rsl, is(expected));
    }
}
