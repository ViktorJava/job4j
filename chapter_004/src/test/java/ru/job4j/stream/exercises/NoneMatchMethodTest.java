package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Тест проверки пустых строк.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 24.12.2020
 */
public class NoneMatchMethodTest {
    @Test
    public void test() {
        assertTrue(NoneMatchMethod.check(List.of("1", "2", "3")));
        assertFalse(NoneMatchMethod.check(List.of("1", "", "3")));
    }
}
