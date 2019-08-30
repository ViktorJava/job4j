package ru.job4j;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Класс Unit (JUnit framework) тестов в связке с библиотекой hamcrest
 *
 * @author Created by ViktorJava on 27.08.2019 (gipsyscrew@gmail.com)
 * @version 0.0.1
 */
public class SqMaxTest {

    /**
     * Тест максимального значения первого аргумента First
     * В предикат-функции assertThat применяется hamcrest декоратор "is"
     */
    @Test
    public void whenFirstMax() {
        SqMax sqMax = new SqMax();
        int result = sqMax.max(4, 3, 2, 1);
        assertThat(result, is(4));
    }

    //Тест максимального значения второго аргумента
    @Test
    public void whenSecondMax() {
        SqMax sqMax = new SqMax();
        int result = sqMax.max(3, 4, 2, 1);
        assertThat(result, is(4));
    }

    //Тест максимального значения третьего аргумента
    @Test
    public void whenThirdMax() {
        SqMax sqMax = new SqMax();
        int result = sqMax.max(3, 2, 4, 1);
        assertThat(result, is(4));
    }

    //Тест максимального значения четвёртого аргумента
    @Test
    public void whenForthMax() {
        SqMax sqMax = new SqMax();
        int result = sqMax.max(4, 3, 5, 6);
        assertThat(result, is(6));
    }

    //Тест максимального значения всех аргументов
    @Test
    public void whenAllEqual() {
        SqMax sqMax = new SqMax();
        int result = sqMax.max(4, 4, 4, 4);
        assertThat(result, is(4));
    }
}