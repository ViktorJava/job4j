package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author Created by ViktorJava on 26.08.2019 (gipsyscrew@gmail.com)
 * @version 0.0.1
 */
public class MaxTest {
    @Test
    public void firstMax() {
        Max max = new Max();
        int result = max.max(3, 1);
        assertThat(result, is(3));
    }

    @Test
    public void secondMax() {
        Max max = new Max();
        int result = max.max(1, 6);
        assertThat(result, is(6));
    }

    @Test
    public void firstEqualSecond() {
        Max max = new Max();
        int result = max.max(9, 9);
        assertThat(result, is(9));

    }
}