package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Тесты метода поиска нечётных чисел в диапазоне.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 23.11.2020
 */
public class OddCountTest {
    @Test
    public void test() {
        assertEquals(1, OddCount.count(1, 2));
        assertEquals(2, OddCount.count(1, 3));
        assertEquals(2, OddCount.count(1, 4));
        assertEquals(3, OddCount.count(1, 5));
    }
}
