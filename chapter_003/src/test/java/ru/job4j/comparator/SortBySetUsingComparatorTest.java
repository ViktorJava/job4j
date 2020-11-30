package ru.job4j.comparator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Тест метода получения множества из списка данных типа String.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 30.11.2020
 */
public class SortBySetUsingComparatorTest {
    @Test
    public void test() {
        List<String> input = Arrays.asList("1", "2", "3", "4", "5");
        Set<String> result = SortBySetUsingComparator.sort(input);
        Set<String> expect = new TreeSet<>(Set.of("5", "4", "3", "2", "1"));
        Assert.assertEquals(expect, result);
    }
}