package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Максимальная длина неубывающей последовательности.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 26.11.2021
 */
public class MaxLengthSeriaTest {
    @Test
    public void test() {
        assertEquals(1, MaxLengthSeria.find(new int[]{1}));
        assertEquals(1, MaxLengthSeria.find(new int[]{2, 1}));
        assertEquals(2, MaxLengthSeria.find(new int[]{1, 2}));
        assertEquals(4, MaxLengthSeria.find(new int[]{1, 2, 0, 1, 2, 3}));
        assertEquals(4, MaxLengthSeria.find(new int[]{1, 2, 1, 1, 2, 3}));
        assertEquals(1, MaxLengthSeria.find(new int[]{3, 2, 1}));
    }
}
