package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Тест сборки элементов стрима в коллекцию LinkedHashMap.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 21.12.2020
 */
public class CollectToAnyMapTest {
    @Test
    public void testContent() {
        List<Integer> data = List.of(2, 2, 3, 3, 2);
        Map<Integer, Integer> expected = Map.of(
                2, 4,
                3, 9
        );
        Map<Integer, Integer> result = CollectToAnyMap.collect(data.stream());
        assertEquals(expected, result);
    }

    @Test
    public void testClassName() {
        List<Integer> data = List.of();
        String expectClass = "java.util.LinkedHashMap";
        String resultClass = CollectToAnyMap.collect(data.stream())
                                            .getClass()
                                            .getName();
        assertEquals(expectClass, resultClass);
    }
}
