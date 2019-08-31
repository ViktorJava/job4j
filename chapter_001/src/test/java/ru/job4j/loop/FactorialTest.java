package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс Unit (JUnit framework) тестов в связке с библиотекой hamcrest
 *
 * @author Created by ViktorJava on 31.08.2019 (gipsyscrew@gmail.com)
 * @version 0.0.1
 */
public class FactorialTest {

    //    Тест проверит факториал числа 5
    @Test
    public void whenCalculateFactorialForFiveTheOneHundreedTwenty() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        assertThat(result, is(120));
    }

    //Тест проверит факториал нуля
    @Test
    public void whenCalculateFactorrialForZeroThenOne() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(0);
        assertThat(result, is(1));
    }

}