package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MaxTest {
    @Test
    public void firstMax() {
        Max max = new Max();
        int result = Max.max(3, 1);
        assertThat(result, is(3));
    }

    @Test
    public void secondMax() {
        Max max = new Max();
        int result = Max.max(1, 6);
        assertThat(result, is(6));
    }

    @Test
    public void firstEqualSecond() {
        Max max = new Max();
        int result = Max.max(9, 9);
        assertThat(result, is(9));
    }

    @Test
    public void firstSecondOrThirdMax() {
        Max max = new Max();
        int result = Max.max(1, 9, 6);
        assertThat(result, is(9));
    }

    @Test
    public void firstSecondThirdOrFourthMax() {
        Max max = new Max();
        int result = Max.max(1, 2, 6, 4);
        assertThat(result, is(6));
    }

    @Test
    public void allOperandsAreEqual() {
        int result = Max.max(3, 3, 3, 3);
        assertThat(result, is(3));
    }
}