package ru.job4j.stream.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Тесты методов обработки стримов примитивного типа.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10.01.2021
 */
public class TerminalForPrimitiveTest {
    @Test
    public void test() {
        int[] data = {1, 2, 3};
        TerminalForPrimitive terminal = new TerminalForPrimitive(data);
        assertEquals(3, terminal.count());
        assertEquals(3, terminal.max());
        assertEquals(1, terminal.min());
        assertEquals(6, terminal.sum());
        assertEquals(2, terminal.avg(), 0.01);
    }
}
