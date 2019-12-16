package ru.job4j.strategy;

import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Тест построения треугольника.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 11.12.2019
 */
public class TriangleTest {
    @Test
    public void whenDrawTriangle() {
        assertThat(new Triangle().draw(), is(new StringJoiner(System.lineSeparator())
                .add("*")
                .add("**")
                .add("* *")
                .add("****" + System.lineSeparator())
                .toString()));
    }
}