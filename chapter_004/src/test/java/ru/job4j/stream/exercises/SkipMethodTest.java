package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест получения списка элементов за исключением первых двух.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 21.12.2020
 */
public class SkipMethodTest {
    @Test
    public void test() {
        assertEquals(
                List.of("C", "D", "E"),
                SkipMethod.lastThree(List.of("A", "B", "C", "D", "E"))
        );
    }
}
