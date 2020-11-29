package ru.job4j.comparator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Тест сортировки списка строк через создание новой коллекции.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 29.11.2020
 */
public class SortBySetTest {
    @Test
    public void test() {
        List<String> input = Arrays.asList("5", "4", "3", "2", "1");
        Set<String> result = SortBySet.sort(input);
        Set<String> expected = new TreeSet<>(Set.of("1", "2", "3", "4", "5"));
        Assert.assertEquals(expected, result);
    }
}
