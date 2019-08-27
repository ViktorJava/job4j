package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Добавьте несколько тест-методов: максимум первое число,
 * максимум второе число. максимум третье число, все числа одинаковые.
 *
 * @author Created by ViktorJava on 27.08.2019 (gipsyscrew@gmail.com)
 * @version 0.0.1
 */
public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(5, 4, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(5, 9, 2);
        assertThat(result, is(9));
    }

    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(5, 9, 12);
        assertThat(result, is(12));
    }

    @Test
    public void allEquil() {
        MultiMax check = new MultiMax();
        int result = check.max(3, 3, 3);
        assertThat(result, is(3));
    }
}