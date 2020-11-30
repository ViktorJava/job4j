package ru.job4j.comparator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

/**
 * Тест сортировки Map в обратном порядке.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 01.12.2020
 */
public class SortMapTest {
    @Test
    public void test() {
        Map<Integer, String> input = Map.of(
                1, "1",
                2, "2",
                3, "3"
        );
        Map<Integer, String> expect = new TreeMap<>(input);
        Map<Integer, String> result = SortMap.sort(input);
        Assert.assertEquals(expect, result);
    }
}
