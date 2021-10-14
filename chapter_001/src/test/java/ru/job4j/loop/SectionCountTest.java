package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Найти количество отрезков, используя цикл.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10/14/2021
 */
public class SectionCountTest {
    @Test
    public void test() {
        assertEquals(1, SectionCount.count(1, 1));
        assertEquals(2, SectionCount.count(2, 1));
        assertEquals(1, SectionCount.count(3, 2));
        assertEquals(2, SectionCount.count(4, 2));
    }
}
