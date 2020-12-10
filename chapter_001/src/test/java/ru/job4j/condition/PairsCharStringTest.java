package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Тесты проверки двух строк на необычность.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10.12.2020
 */
public class PairsCharStringTest {
    @Test
    public void checkTrue() {
        boolean result = PairsCharString.check(" ", " ");
        assertThat(result, is(true));
    }

    @Test
    public void checkTrue1() {
        boolean result = PairsCharString.check("sparkling", "groups");
        assertThat(result, is(true));
    }

    @Test
    public void checkFalse() {
        boolean result = PairsCharString.check("booking", "grabber");
        assertThat(result, is(false));
    }
}
