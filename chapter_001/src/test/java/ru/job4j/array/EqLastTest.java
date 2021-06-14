package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * Тесты сравнения последних элементов двух массивов.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 14.06.2021
 */
public class EqLastTest {
    @Test
    public void whenEq() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        boolean result = EqLast.check(left, right);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 2, 3};
        int[] right = {6, 5, 4};
        boolean result = EqLast.check(left, right);
        Assert.assertFalse(result);
    }
}
