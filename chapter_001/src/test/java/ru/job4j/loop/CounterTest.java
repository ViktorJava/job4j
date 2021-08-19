package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Класс Unit (JUnit framework) тестов в связке с библиотекой hamcrest
 *
 * @author Created by ViktorJava on 31.08.2019 (gipsyscrew@gmail.com)
 * @version 0.0.1
 */
public class CounterTest {

    /**
     * Тест подсчет суммы чётных чисел в диапазоне от 0 до 10.
     * Ожидаемое значение 30
     * В предикат-функции assertThat применяется hamcrest декоратор "is"
     */

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
        int result = counter.add(10, 15);
        assertThat(result, is(36));
    }
}