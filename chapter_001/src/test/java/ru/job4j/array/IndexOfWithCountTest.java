package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Тесты indexOf с числом вхождений.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/25/2021
 */
public class IndexOfWithCountTest {
    @Test
    public void whenNotContain() {
        assertEquals(-1, IndexOfWithCount.indexOf(
                new char[]{'a', 'b', 'c'},
                'd',
                1
        ));
    }

    @Test
    public void whenOrdinary() {
        assertEquals(3, IndexOfWithCount.indexOf(
                new char[]{'a', 'b', 'c', 'd'},
                'd',
                1
        ));
    }

    @Test
    public void whenByNumber() {
        assertEquals(6, IndexOfWithCount.indexOf(
                new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'd'},
                'd',
                2
        ));
    }
}
