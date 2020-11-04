package ru.job4j.lambda;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

/**
 * Тесты.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 29.10.2020
 */
public class OptionalOrElseTest {
    @Test
    public void test() {
        assertEquals(Integer.valueOf(-1), OptionalOrElse.orElse(Optional.empty()));
        assertEquals(Integer.valueOf(1), OptionalOrElse.orElse(Optional.of(1)));
    }
}
