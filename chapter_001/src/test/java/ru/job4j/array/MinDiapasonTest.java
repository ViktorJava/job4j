package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * Тесты поиска минимума в диапазоне.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 15.06.2021
 */
public class MinDiapasonTest {
    @Test
    public void whenFirstMin() {
        int[] array = {-1, 0, 5, 10};
        int start = 1;
        int finish = 3;
        int rst = MinDiapason.findMin(array, start, finish);
        int expected = 0;
        Assert.assertEquals(expected, rst);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[]{10, 5, 3, 1};
        int start = 1;
        int finish = 3;
        int result = MinDiapason.findMin(array, start, finish);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[]{10, 2, 5, 1};
        int start = 0;
        int finish = 2;
        int result = MinDiapason.findMin(array, start, finish);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
}
