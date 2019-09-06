package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 06.09.2019
 */
public class FindLoopTest {

    /**
     * Тест нахождения значения 5 в массиве под индексом 0
     */
    @Test
    public void whenArrayHas5Then0() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = findLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    /**
     * Тест не нахождения значения 15 в массиве
     */
    @Test
    public void whenArrayDoesNot5Then1() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 15;
        int result = findLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

}