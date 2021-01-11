package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Тест сборки мапы из потока чисел.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 21.12.2020
 */
public class CollectToMapTest {
    @Test
    public void test() {
        List<Integer> data = List.of(2, 3, 9);
        Map<Integer, Integer> expected = Map.of(
                2, 4,
                3, 9,
                9, 81
        );
        Map<Integer, Integer> result = CollectToMap.collect(data.stream());
        assertEquals(expected, result);
    }
}
