package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Тесты метода проверки массива на сортировку.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 04.11.2020
 */
public class SortedTest {
    @Test
    public void whenSorted() {
        assertThat(Sorted.isSorted(new int[]{1, 2, 3}), is(true));
    }

    @Test
    public void whenNotSorted() {
        assertThat(Sorted.isSorted(new int[]{3, 2, 1}), is(false));
    }
}
