package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тесты метода расчёта чистой прибыли.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 01.11.2020
 */
public class GameTest {
    @Test
    public void checkGame() {
        int rsl = Game.checkGame(0.2, 50, 9);
        assertThat(rsl, is(1));
    }

    @Test
    public void checkGameIs0() {
        int rsl = Game.checkGame(0.9, 1, 2);
        assertThat(rsl, is(0));
    }
}