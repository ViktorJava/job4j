package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 03.09.2019
 */
public class PrimeNumberTest {
    @Test
    public void when5() {
        PrimeNumber primeNumber = new PrimeNumber();
        int count = primeNumber.calc(5);
        assertThat(count, is(3));
    }

    @Test
    public void when11() {
        PrimeNumber primeNumber = new PrimeNumber();
        int count = primeNumber.calc(11);
        assertThat(count, is(5));
    }

    @Test
    public void when1() {
        PrimeNumber primeNumber = new PrimeNumber();
        int count = primeNumber.calc(2);
        assertThat(count, is(1));
    }
}
