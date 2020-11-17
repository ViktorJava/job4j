package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * Тест максимального значения из первого или последнего элементов массива.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 17.11.2020
 */
public class MaxFirstOrLastElementTest {
    @Test
    public void getMaxValueFirstElement() {
        int[] a = {5, 4, 3, 2, 1};
        int result = MaxFirstOrLastElement.getMaxValue(a);
        int expected = 5;
        assertThat(result, is(expected));
    }

    @Test
    public void getMaxValueLastElement() {
        int[] a = {1, 2, 3, 4, 5};
        int result = MaxFirstOrLastElement.getMaxValue(a);
        int expected = 5;
        assertThat(result, is(expected));
    }
}
