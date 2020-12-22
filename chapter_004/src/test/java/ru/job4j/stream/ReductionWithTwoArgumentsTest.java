package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест умножения на 5 элементов списка целочисленного типа.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 22.12.2020
 */
public class ReductionWithTwoArgumentsTest {
    @Test
    public void test() {
        assertEquals(Integer.valueOf(5), ReductionWithTwoArguments.collect(
                List.of())
        );
        assertEquals(Integer.valueOf(5), ReductionWithTwoArguments.collect(
                List.of(1))
        );
        assertEquals(Integer.valueOf(10), ReductionWithTwoArguments.collect(
                List.of(1, 2))
        );
        assertEquals(Integer.valueOf(30), ReductionWithTwoArguments.collect(
                List.of(1, 2, 3))
        );
    }
}
