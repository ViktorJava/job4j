package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Тест метода определяющего число Хэмминга.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 24.11.2020
 */
public class HammingTest {
    @Test
    public void checkStringsIs3() {
        int result = Hamming.checkStrings("2173896", "2233796");
        assertThat(result, is(3));
    }

    @Test
    public void checkStringIs5() {
        int result = Hamming.checkStrings("abcde", "bcdef");
        assertThat(result, is(5));
    }

    @Test
    public void checkStringIs0() {
        int result = Hamming.checkStrings("abcde", "abcde");
        assertThat(result, is(0));
    }
}
