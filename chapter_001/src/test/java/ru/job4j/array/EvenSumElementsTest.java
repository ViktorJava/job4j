package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Тесты четности суммы массива целочисленных значений.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 09.12.2020
 */
public class EvenSumElementsTest {
    @Test
    public void checkArrayFalse() {
        int[] data = {1, 2, 3, 4, 5};
        boolean rsl = EvenSumElements.checkArray(data);
        assertThat(rsl, is(false));
    }

    @Test
    public void checkArrayTrue() {
        int[] data = {1, 2, 3, 4, 5, 6, 7};
        boolean rsl = EvenSumElements.checkArray(data);
        assertThat(rsl, is(true));
    }
}
