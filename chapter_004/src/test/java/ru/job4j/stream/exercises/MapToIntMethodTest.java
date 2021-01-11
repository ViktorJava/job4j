package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест преобразования списка символов в сумму кодов этих символов.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 26.12.2020
 */
public class MapToIntMethodTest {
    @Test
    public void test() {
        List<Character> input = List.of('a', 'b', 'c');
        assertEquals(294, MapToIntMethod.sum(input));
    }
}
