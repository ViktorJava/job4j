package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * Тесты поиска минимального числа в массиве.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 15.06.2021
 */
public class MinTest {
    @Test
    public void whenFirstMin() {
        int[] array = {0, 3, 5};
        int rst = Min.findMin(array);
        int expected = 0;
        Assert.assertEquals(expected, rst);
    }

    @Test
    public void whenLastMin() {
        int[] array = {10, 5, 3};
        int rst = Min.findMin(array);
        int expected = 3;
        Assert.assertEquals(expected, rst);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = {10, 6, 8};
        int rst = Min.findMin(array);
        int expected = 6;
        Assert.assertEquals(expected, rst);
    }
}
