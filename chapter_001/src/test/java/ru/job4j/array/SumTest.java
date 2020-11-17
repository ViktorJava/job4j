package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Тест метода суммы первого и последнего элементов массива.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 16.11.2020
 */
public class SumTest {
    @Test
    public void getSum() {
        int[] array = {12, 20, 70};
        int result = 82;
        int expected = Sum.getSum(array);
        assertThat(result, is(expected));
    }
}
