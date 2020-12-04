package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 14.09.2019
 */
public class MatrixCheckTest {

    /**
     * Тест выигрышной ситуации
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        char[][] input = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }

    /**
     * Тест проигрышной ситуации
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] input = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', 'X', '_', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(false));
    }
}
