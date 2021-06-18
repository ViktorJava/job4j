package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * Тесты двухмерный массив. Циклы.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 18.06.2021
 */
public class MatrixSumTest {
    @Test
    public void whenSingle() {
        int[][] array = {{10}};
        int rsl = MatrixSum.sum(array);
        int expected = 10;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenTwo() {
        int[][] array = {
                {1, 2},
                {1, 2}
        };
        int rsl = MatrixSum.sum(array);
        int expected = 6;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenThree() {
        int[][] array = {{1, 2, 3}, {1, 2, 3}};
        int rsl = MatrixSum.sum(array);
        int expected = 12;
        Assert.assertEquals(expected, rsl);
    }
}
