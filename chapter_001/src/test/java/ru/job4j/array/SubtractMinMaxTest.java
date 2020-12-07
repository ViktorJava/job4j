package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Тест разницы между максимальным и минимальным значениями
 * в массиве целых чисел.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 07.12.2020
 */
public class SubtractMinMaxTest {
    @Test
    public void calculateIs18() {
        int[] ints = {10, 15, 20, 2, 10, 6};
        int res = SubtractMinMax.calculate(ints);
        assertThat(res, is(18));
    }

    @Test
    public void calculateIs24() {
        int[] ints = {-3, 4, -9, -1, -2, 15};
        int res = SubtractMinMax.calculate(ints);
        assertThat(res, is(24));
    }
}
