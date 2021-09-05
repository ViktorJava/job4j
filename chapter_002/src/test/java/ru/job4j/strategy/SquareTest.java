package ru.job4j.strategy;

import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Тест построения прямоугольника.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10.12.2019
 */
public class SquareTest {
    @Test
    public void whenDrawSquare() {
        assertThat(new Square().draw(), is(new StringJoiner(System.lineSeparator())
                .add("****")
                .add("*  *")
                .add("*  *")
                .add("****" + System.lineSeparator())
                .toString()));
    }
}