package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 07.01.2020
 */
public class FactTest {
    /**
     * Тест на выбрасывание исключения незаконного аргумента (IllegalArgumentException).
     */
    @Test(expected = IllegalArgumentException.class)
    public void whenArgLessOne() {
        int res = Fact.cal(-3);
    }

    /**
     * Тест расчёта факториала n!=100
     */
    @Test
    public void calcFact100() {
        int res = Fact.cal(100);
        assertThat(res, is(4951));
    }
}
