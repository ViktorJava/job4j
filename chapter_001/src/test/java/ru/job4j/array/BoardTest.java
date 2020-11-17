package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тесты методов расчёта размера двумерного массива.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 17.11.2020
 */
public class BoardTest {
    /**
     * Тест метода возвращающего размер двумерного массива (кол-во рядов).
     */
    @Test
    public void getCountRow() {
        int[][] array = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
        int expected = 3;
        int result = Board.getCountRow(array);
        assertThat(result, is(expected));
    }

    /**
     * Тест метода возвращающего кол-во элементов в заданном ряду.
     */
    @Test
    public void getCountCellInRow() {
        int[][] array = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
        int expected = 3;
        int result = Board.getCountCellInRow(array, 1);
        assertThat(result, is(expected));
    }
}
