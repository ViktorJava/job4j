package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тесты метода квадратности массива.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 18.11.2020
 */
public class CheckSquareArrayTest {
    @Test
    public void checkArrayTrue() {
        int[][] array = new int[][]{{1, 2, 3}, {78, 29, 64}, {12, 72, 19}};
        boolean result = CheckSquareArray.checkArray(array);
        assertThat(result, is(true));
    }

    @Test
    public void checkArrayFalse() {
        int[][] array = new int[][]{{1, 5}, {64, 25, 78}, {25, 27}};
        boolean result = CheckSquareArray.checkArray(array);
        assertThat(result, is(false));
    }
}
