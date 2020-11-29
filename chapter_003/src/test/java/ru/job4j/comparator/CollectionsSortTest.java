package ru.job4j.comparator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Тест сортировки списка строк в восходящем порядке без null.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 29.11.2020
 */
public class CollectionsSortTest {
    @Test
    public void test() {
        List<String> input = Arrays.asList("3", "2", "1");
        List<String> expected = Arrays.asList("1", "2", "3");
        List<String> out = CollectionsSort.sort(input);
        Assert.assertEquals(expected, out);
    }
}
