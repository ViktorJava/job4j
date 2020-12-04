package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тесты метода, определяющего общую длину двух массивов чисел.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 16.11.2020
 */
public class ConcatArrayTest {
    @Test
    public void whenMethodReturnResultEight() {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6, 7, 8, 9, 10};
        int result = 10;
        int expected = ConcatArray.combineSize(a, b);
        assertThat(expected, is(result));
    }

    @Test
    public void whenMethodReturnResultTwelve() {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = {8, 10, 12};
        int result = 10;
        int expected = ConcatArray.combineSize(a, b);
        assertThat(expected, is(result));
    }
}
