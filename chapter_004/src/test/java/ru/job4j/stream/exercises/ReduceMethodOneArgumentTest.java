package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест нахождения произведения чисел.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 22.12.2020
 */
public class ReduceMethodOneArgumentTest {
    @Test
    public void test() {
        assertEquals(Integer.valueOf(6), ReduceMethodOneArgument.reduce(
                List.of(1, 2, 3))
        );
        assertEquals(Integer.valueOf(1), ReduceMethodOneArgument.reduce(
                List.of(1))
        );
        assertEquals(Integer.valueOf(24), ReduceMethodOneArgument.reduce(
                List.of(1, 2, 3, 4))
        );
    }
}
