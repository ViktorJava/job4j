package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * Тесты заполнения массива степенями чисел.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.2
 * @since 06.09.2019
 */
public class SquareTest {

    /**
     * Тест метода calculate с аргументом 3
     */
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        int[] rst = Square.calculate(bound);
        int[] expected = new int[]{1, 4, 9};
        Assert.assertArrayEquals(expected, rst);
    }

    /**
     * Тест метода calculate с аргументом 6
     */
    @Test
    public void whenBound6Then149() {
        int bound = 5;
        int[] rst = Square.calculate(bound);
        int[] expected = new int[]{1, 4, 9, 16, 25};
        Assert.assertArrayEquals(expected, rst);
    }
}
