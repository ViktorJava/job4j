package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Тесты  Optional. Методы isPresent(), isEmpty(), get().
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 29.10.2020
 */
public class OptionalGetAndIsPresentTest {
    @Test
    public void whenExist() {
        assertEquals(1,
                OptionalGetAndIsPresent.get(new int[]{1, 2, 3}, 2));
    }

    @Test
    public void whenNotExist() {
        assertEquals(-1,
                OptionalGetAndIsPresent.get(new int[]{1, 2, 3}, 4));
    }

}
