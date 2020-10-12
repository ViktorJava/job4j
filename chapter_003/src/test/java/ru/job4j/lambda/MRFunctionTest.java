package ru.job4j.lambda;

import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.assertEquals;

/**
 * Тесты расчёта квадратного корня из числа.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 11.10.2020
 */
public class MRFunctionTest {
    @Test
    public void test() {
        Function<Double, Double> f = MRFunction.apply();
        assertEquals(2.0, f.apply(4.0), 0.01);
        assertEquals(3.0, f.apply(9.0), 0.01);
    }
}
