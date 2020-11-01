package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Тест метода расчёта суммы цифр.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 31.10.2020
 */
public class DigitSumTest {
    @Test
    public void test() {
        assertEquals(1, DigitSum.sum(1));
        assertEquals(3, DigitSum.sum(12));
        assertEquals(6, DigitSum.sum(123));
        assertEquals(10, DigitSum.sum(1234));
        assertEquals(15, DigitSum.sum(12345));
    }
}
