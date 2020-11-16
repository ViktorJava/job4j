package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


/**
 * Тесты методов возвращающих первый и последний элементы массива.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 16.11.2020
 */
public class ArrayIndexTest {
    @Test
    public void getFirstElement() {
        int[] a = {1, 2, 3, 4, 5, 6};
        int expected = 1;
        int result = ArrayIndex.getFirstElement(a);
        assertThat(result, is(expected));
    }

    @Test
    public void getLastElement() {
        int[] a = {1, 2, 3, 4, 5, 6};
        int expected = 6;
        int result = ArrayIndex.getLastElement(a);
        assertThat(result, is(expected));
    }
}
