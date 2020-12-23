package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Тест метода, проверки строки, что хотя бы одна строка из списка строк,
 * начинается на "job4j".
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 23.12.2020
 */
public class AnyMatchMethodTest {
    @Test
    public void test() {
        assertTrue(AnyMatchMethod.check(List.of("Creative studio", "job4j")));
        assertFalse(AnyMatchMethod.check(List.of("Integral", "Interpol")));
    }
}
