package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест фильтра списка целых чисел, чтобы остались только четные числа.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 17.12.2020
 */
public class FilterNumbersTest {
    @Test
    public void test() {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        List<Integer> expected = List.of(2, 4);
        List<Integer> result = FilterNumbers.filter(numbers);
        assertEquals(expected, result);
    }
}
