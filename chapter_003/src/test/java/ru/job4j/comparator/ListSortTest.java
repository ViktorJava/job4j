package ru.job4j.comparator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Тест сортировки списка строк с null элементами.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 29.11.2020
 */
public class ListSortTest {
    @Test
    public void sort() {
        List<String> data = Arrays.asList(null, "a", "b", "c");
        List<String> result = ListSort.sort(data);
        List<String> expected = Arrays.asList("c", "b", "a", null);
        Assert.assertEquals(expected, result);
    }
}
