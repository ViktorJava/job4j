package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Тест того случая, когда элементы массива являются
 * или не являются делителями заданного числа.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 08.12.2020
 */
public class DividerTest {
    @Test
    public void checkTrue() {
        int[] ints = {2, 3, 4};
        boolean result = Divider.check(12, ints);
        assertThat(result, is(true));
    }

    @Test
    public void checkFalse() {
        int[] ints = {1, 2, 3, 6, 9, 11};
        boolean result = Divider.check(18, ints);
        assertThat(result, is(false));
    }
}
