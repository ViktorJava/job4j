package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/12/2021
 */
public class ModWithLoopTest {
    @Test
    public void test() {
        assertEquals(0, ModWithLoop.mod(4, 2));
        assertEquals(1, ModWithLoop.mod(3, 2));
        assertEquals(2, ModWithLoop.mod(8, 3));
        assertEquals(0, ModWithLoop.mod(0, 3));
    }
}