package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест изменения списка строк.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 26.12.2020
 */
public class StringMapTest {
    @Test
    public void test() {
        List<String> input = List.of("One", "Two");
        List<String> expected = List.of("One.Java", "Two.Java");
        assertEquals(expected, StringMap.map(input));
    }
}
