package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 13.12.2020
 */
public class MergeRowsTest {
    @Test
    public void teat() {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] out = MergeRows.merge(input);
        assertArrayEquals(expected, out);
    }
}