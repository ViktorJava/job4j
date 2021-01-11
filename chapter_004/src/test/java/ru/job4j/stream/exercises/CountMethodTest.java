package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест подсчёта количества элементов в потоке.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 20.12.2020
 */
public class CountMethodTest {
    @Test
    public void test() {
        assertEquals(4, CountMethod.count(List.of(1, 2, 3, 4)
                                              .stream()));
    }
}
