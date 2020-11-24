package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Тест проверки числа на симметричность.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 25.11.2020
 */
public class SymmetryTest {
    @Test
    public void checkTrue() {
        boolean result = Symmetry.check(111121111);
        assertThat(result, is(true));
    }

    @Test
    public void thenCheckTrue() {
        boolean result = Symmetry.check(1221);
        assertThat(result, is(true));
    }

    @Test
    public void checkFalse() {
        boolean result = Symmetry.check(123456);
        assertThat(result, is(false));
    }

}
