package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Тесты транспонирования матрицы.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 12.12.2020
 */
public class TranspositionTest {
    @Test
    public void whenSquare() {
        int[][] input = {
                {1, 2},
                {3, 4}
        };
        int[][] expect = {
                {1, 3},
                {2, 4}
        };
        assertArrayEquals(expect, Transposition.convert(input));
    }

    @Test
    public void whenNotSquare() {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] expect = {
                {1, 4},
                {2, 5},
                {3, 6}
        };
        assertArrayEquals(expect, Transposition.convert(input));
    }

    @Test
    public void whenNotSquare2() {
        int[][] input = {
                {1, 4},
                {2, 5},
                {3, 6}
        };
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6}
        };
        assertArrayEquals(expect, Transposition.convert(input));
    }
}
