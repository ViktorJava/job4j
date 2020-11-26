package ru.job4j.comparator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Тест метода, сортировки массива строк в убывающем порядке.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 26.11.2020
 */
public class ArraysSortWithObjectTest {
    @Test
    public void test() {
        String[] input = {"a", "b", "c"};
        String[] result = ArraysSortWithObject.sort(input);
        String[] expected = {"c", "b", "a"};
        Assert.assertArrayEquals(expected, result);
    }
}
