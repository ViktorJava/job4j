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

    @Test(expected = IllegalArgumentException.class)
    public void whenArgLess0() {
        int res = Fact.cal(-3);
    }

    @Test
    public void calcFact5() {
        int res = Fact.cal(5);
        assertThat(res, is(120));
    }
}
