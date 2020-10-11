package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Тест получения квадратного корня из числа.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 05.10.2020
 */
public class FunctionSqrtTest {
    @Test
    public void test() {
        assertEquals(2, FunctionSqrt.calculate(4), 0.01);
        assertEquals(3, FunctionSqrt.calculate(9), 0.01);
    }
}
