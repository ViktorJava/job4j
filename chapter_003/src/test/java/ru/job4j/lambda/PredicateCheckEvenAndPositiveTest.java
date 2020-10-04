package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Тест четности и положительности числа.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 05.10.2020
 */
public class PredicateCheckEvenAndPositiveTest {
    @Test
    void test() {
        assertTrue(PredicateCheckEvenAndPositive.check(2));
        assertFalse(PredicateCheckEvenAndPositive.check(-2));
        assertFalse(PredicateCheckEvenAndPositive.check(1));
    }
}
