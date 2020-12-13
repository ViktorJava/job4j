package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Тест перестановки двух строк двумерного массива, местами.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 13.12.2020
 */
public class SwapRowsTest {
    @Test
    public void test() {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] expect = {
                {4, 5, 6},
                {1, 2, 3}
        };
        SwapRows.swap(input, 0, 1);
        assertArrayEquals(expect, input);
    }

    @Test
    public void test2() {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expect = {
                {7, 8, 9},
                {4, 5, 6},
                {1, 2, 3}
        };
        SwapRows.swap(input, 0, 2);
        assertArrayEquals(expect, input);
    }
}
