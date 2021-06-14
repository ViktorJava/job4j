package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * Тесты метода перестановки местами элементов массива.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 14.06.2021
 */
public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to3() {
        int[] input = {1, 2, 3, 4};
        int source = 1;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 4, 3, 2};
        Assert.assertArrayEquals(expected, result);
    }
}
