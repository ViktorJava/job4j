package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тесты метода, возвращающего максимальный элемент
 * из двух: первый или последний элемент.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 17.11.2020
 */
public class IndexMaxElementTest {
    @Test
    public void getIndexMaxIs4() {
        int[] array = {1, 2, 3, 4, 5};
        int result = IndexMaxElement.getIndexMax(array);
        int expected = 4;
        assertThat(result, is(expected));
    }

    @Test
    public void getIndexMaxIs0() {
        int[] array = {5, 4, 3, 2, 1};
        int result = 0;
        int expected = IndexMaxElement.getIndexMax(array);
        assertThat(result, is(expected));
    }
}
