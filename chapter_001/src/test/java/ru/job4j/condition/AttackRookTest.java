package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Тесты ладьи на шахматной доске.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10.12.2020
 */
public class AttackRookTest {
    @Test
    public void checkTrue() {
        boolean result = AttackRook.check("A8", "E8");
        assertThat(result, is(true));
    }

    @Test
    public void checkTrue1() {
        boolean result = AttackRook.check("H4", "H3");
        assertThat(result, is(true));
    }

    @Test
    public void checkFalse() {
        boolean check = AttackRook.check("A1", "B2");
        assertThat(check, is(false));
    }

    @Test
    public void checkFalse1() {
        boolean check = AttackRook.check("F5", "C8");
        assertThat(check, is(false));
    }
}
