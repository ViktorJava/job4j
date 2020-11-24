package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Тест метода шифровки строки.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 24.11.2020
 */
public class CryptographyTest {
    @Test
    public void codeLengthGreat4() {
        String code = Cryptography.code("4556364607935616");
        assertThat(code, is("############5616"));
    }

    @Test
    public void codeLengthLess4() {
        String code = Cryptography.code("1234");
        assertThat(code, is("1234"));
    }

    @Test
    public void codeEmptyString() {
        String code = Cryptography.code("");
        assertThat(code, is("empty"));
    }
}
