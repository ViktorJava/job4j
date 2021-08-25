package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;


/**
 * Тесты метода проверки элементов в заданной строке массива, что они
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
}
