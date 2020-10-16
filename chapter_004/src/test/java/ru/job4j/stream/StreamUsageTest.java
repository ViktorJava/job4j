package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Тест фильтрации списка чисел.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 14.10.2020
 */
public class StreamUsageTest {
    @Test
    public void test() {
        StreamUsage streamUsage = new StreamUsage();
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-2, 2, -6, 4, -8, 6, 0));
        List<Integer> result = streamUsage.pNumber(numbers);
        List<Integer> expect = Arrays.asList(2, 4, 6, 0);
        assertThat(result, is(expect));
    }
}
