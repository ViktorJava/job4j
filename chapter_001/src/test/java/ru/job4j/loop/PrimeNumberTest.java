package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


/**
 * Класс Unit (JUnit framework) тестов с библиотекой hamcrest
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 03.09.2019
 */
public class PrimeNumberTest {
    //тест того случая, когда на диапазоне натуральных чисел от 2 до 5 будет 3 простых числа
    @Test
    public void when5() {
        PrimeNumber primeNumber = new PrimeNumber();
        int count = primeNumber.calc(5);
        assertThat(count, is(3));
    }

    //тест того случая, когда на диапазоне натуральных чисел от 2 до 11 будет 5 простых чисел
    @Test
    public void when11() {
        PrimeNumber primeNumber = new PrimeNumber();
        int count = primeNumber.calc(11);
        assertThat(count, is(5));
    }
    //тест того случая, когда на диапазоне натуральных чисел от 2 до 2 будет 1 простое число это 2
    @Test
    public void when1() {
        PrimeNumber primeNumber = new PrimeNumber();
        int count = primeNumber.calc(2);
        assertThat(count, is(1));
    }


}