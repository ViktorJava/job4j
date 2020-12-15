package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест сбора переданного стрима целых чисел типа Integer
 * в ArrayList.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 15.12.2020
 */
public class CollectToListTest {
    @Test
    public void test() {
        List<Integer> input = List.of(1, 2, 3);
        List<Integer> expected = List.of(1, 2, 3);
        assertEquals(expected, CollectToList.collect(input.stream()));
    }
}
