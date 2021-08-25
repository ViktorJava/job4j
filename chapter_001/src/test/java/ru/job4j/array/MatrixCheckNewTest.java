package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;


/**
 * Тесты проверки элементов в массиве, что они
 * равны символу 'X'.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 8/25/2021
 */
public class MatrixCheckNewTest {
    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheckNew.monoHorizontal(input, row);
        Assert.assertTrue(result);
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheckNew.monoVertical(input, column);
        Assert.assertTrue(result);
    }
}
