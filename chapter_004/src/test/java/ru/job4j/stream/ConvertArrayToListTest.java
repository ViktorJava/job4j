package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тест матрицы чисел, целочисленного типа,
 * в список данных целочисленного типа.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 15.11.2020
 */
public class ConvertArrayToListTest {
    @Test
    public void whenNoDuplicates() {
        Integer[][] array = {{1, 2, 3}, {4, 5, 6}};
        List<Integer> result = ConvertArrayToList.converter(array);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertThat(expected, is(result));
    }

    @Test
    public void whenEnableDuplicates() {
        Integer[][] array = {{1, 2, 3, 4, 5}, {4, 5, 6}};
        List<Integer> result = ConvertArrayToList.converter(array);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 4, 5, 6);
        assertThat(expected, is(result));
    }
}
