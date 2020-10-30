package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Произведение чисел в диапазоне.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 30.10.2020
 */

public class MultiplicationLoopTest {
    @Test
    public void test() {
        assertEquals(0, MultiplicationLoop.mult(0, 2));
        assertEquals(2, MultiplicationLoop.mult(1, 2));
        assertEquals(6, MultiplicationLoop.mult(1, 3));
    }
}
