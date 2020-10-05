package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Тест возведения числа в квадрат.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 05.10.2020
 */
public class FunctionPowTest {
    @Test
    public void test() {
        assertEquals(4, FunctionPow.calculate(2), 0.01);
        assertEquals(9, FunctionPow.calculate(3), 0.01);
    }
}
