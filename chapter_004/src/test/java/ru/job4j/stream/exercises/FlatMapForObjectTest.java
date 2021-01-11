package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест сбора элементов из вложенных списков, в один список.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 09.01.2021
 */
public class FlatMapForObjectTest {
    @Test
    public void test() {
        assertEquals(
                List.of(1, 2, 3, 4),
                FlatMapForObject.flatMap(List.of(
                        List.of(1, 2),
                        List.of(3, 4)
                ))
        );
    }
}
