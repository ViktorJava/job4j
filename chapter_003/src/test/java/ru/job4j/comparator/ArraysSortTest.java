package ru.job4j.comparator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Тест метода сортировки массива примитивов.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 26.11.2020
 */
public class ArraysSortTest {
    @Test
    public void test() {
        long[] data = {3, 2, 1};
        long[] result = ArraysSort.sort(data);
        long[] expected = {1, 2, 3};
        Assert.assertArrayEquals(expected, result);
    }
}
