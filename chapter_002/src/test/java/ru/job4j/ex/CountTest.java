package ru.job4j.ex;

import org.junit.Test;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 07.01.2020
 */
public class CountTest {
    /**
     * Тест исключительной ситуации нелегального аргумента.
     */
    @Test(expected = IllegalArgumentException.class)
    public void whenStartGreaterThenFinish() {
        Count.add(10, 2);
    }
}