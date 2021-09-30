package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Четные vs Нечетные.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/30/2021
 */
public class EvenVsOddTest {
    @Test
    public void whenWinOdd() {
        assertEquals(2, EvenVsOdd.whoWin(new int[]{5, 10, 4, 3}));
    }

    @Test
    public void whenWiEven() {
        assertEquals(1, EvenVsOdd.whoWin(new int[]{10, 5, 4, 3}));
    }

    @Test
    public void whenNobody() {
        assertEquals(0, EvenVsOdd.whoWin(new int[]{6, 5, 4, 5}));
    }
}
