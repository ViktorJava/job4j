package ru.job4j.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.2
 * @since 09.04.2020
 */
public class MachineTest {
    @Test
    public void whenEquals() {
        int[] expected = {};
        int[] result = Machine.change(100, 100);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when50by35() {
        int[] expected = {10, 5};
        int[] result = Machine.change(50, 35);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when50by0() {
        int[] expected = {10, 10, 10, 10, 10};
        int[] result = Machine.change(50, 0);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when50by50() {
        int[] expected = {};
        int[] result = Machine.change(50, 50);
        Assert.assertArrayEquals(expected, result);
    }
}
