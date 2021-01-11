package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест сортировки списка строк.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 25.12.2020
 */
public class SortedMethodTest {
    @Test
    public void test() {
        assertEquals(List.of("a", "b", "c"), SortedMethod.sorted(
                List.of("b", "a", "c"))
        );
    }
}
