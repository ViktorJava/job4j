package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тесты метода арифметических операций.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 02.11.2020
 */
public class ArithmeticActionsTest {
    @Test
    public void selectActionAdded() {
        String action = ArithmeticActions.selectAction(100, 200, 300);
        assertThat(action, is("added"));
    }

    @Test
    public void selectActionSubtracted() {
        String action = ArithmeticActions.selectAction(300, 200, 100);
        assertThat(action, is("subtracted"));
    }

    @Test
    public void selectActionMultiplied() {
        String action = ArithmeticActions.selectAction(10, 10, 100);
        assertThat(action, is("multiplied"));
    }

    @Test
    public void selectActionDivided() {
        String action = ArithmeticActions.selectAction(100, 2, 50);
        assertThat(action, is("divided"));
    }

    @Test
    public void selectActionNone() {
        String action = ArithmeticActions.selectAction(1, 20, 100);
        assertThat(action, is("none"));
    }
}
