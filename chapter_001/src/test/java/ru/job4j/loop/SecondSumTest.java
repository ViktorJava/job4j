package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Найти сумму каждого второго числа в заданном диапазоне.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/13/2021
 */
public class SecondSumTest {
    @Test
    public void test() {
        assertEquals(1, SecondSum.sum(1, 2));
        assertEquals(4, SecondSum.sum(1, 3));
        assertEquals(4, SecondSum.sum(1, 4));
        assertEquals(9, SecondSum.sum(1, 5));
        assertEquals(12, SecondSum.sum(0, 6));
    }
}
