package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Сумма разниц.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10/6/2021
 */
public class SumOfDifferencesTest {
    @Test
    public void test() {
        assertEquals(9, SumOfDifferences.sum(new int[]{10, 2, 1}));
        assertEquals(2, SumOfDifferences.sum(new int[]{3, 2, 1}));
        assertEquals(4, SumOfDifferences.sum(new int[]{5, 4, 3, 2, 1}));
        assertEquals(0, SumOfDifferences.sum(new int[]{5, 3, 1, 5}));
        assertEquals(1, SumOfDifferences.sum(new int[]{10, 9, 7, 3, 4, 8, 6, 9}));
    }
}
