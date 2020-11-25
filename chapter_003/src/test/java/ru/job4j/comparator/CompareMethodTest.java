package ru.job4j.comparator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Тесты методов сравнения двух чисел.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 25.11.2020
 */
public class CompareMethodTest {
    @Test
    public void testAscending() {
        assertEquals(0, CompareMethod.ascendingCompare(1, 1));
        assertEquals(-1, CompareMethod.ascendingCompare(1, 2));
        assertEquals(1, CompareMethod.ascendingCompare(2, 1));
    }

    @Test
    public void testDescending() {
        assertEquals(0, CompareMethod.descendingCompare(1, 1));
        assertEquals(1, CompareMethod.descendingCompare(1, 2));
        assertEquals(-1, CompareMethod.descendingCompare(2, 1));
    }
}
