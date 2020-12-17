package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест получения списка квадратов чисел.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 17.12.2020
 */
public class NumberMapTest {
    @Test
    public void test() {
        List<Integer> data = List.of(2, 4, 6);
        List<Integer> expected = List.of(4, 16, 36);
        assertEquals(expected, NumberMap.map(data));
    }
}
