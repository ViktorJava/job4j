package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Тест метода проверки длинны строк в списке.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 23.12.2020
 */
public class AllMatchMethodTest {
    @Test
    public void test() {
        assertTrue(AllMatchMethod.chec(List.of("abcde", "12345")));
        assertFalse(AllMatchMethod.chec(List.of("ab", "12")));
    }
}
