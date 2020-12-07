package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Тесты расчёта четности и нечётности положительных и отрицательных чисел
 * в массиве.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 08.12.2020
 */
public class PositiveOrNegativeTest {
    @Test
    public void checktrue() {
        int[] data = {-5, -4, -3, -2, -1, 1, 2, 3, 4, 5};
        boolean check = PositiveOrNegative.check(data);
        assertThat(check, is(true));
    }

    @Test
    public void checkfalse() {
        int[] data = {-6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5};
        boolean check = PositiveOrNegative.check(data);
        assertThat(check, is(false));
    }
}
