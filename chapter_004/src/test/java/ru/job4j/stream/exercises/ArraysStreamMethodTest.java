package ru.job4j.stream.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Тест создания стрима из массива типа Integer.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 14.12.2020
 */
public class ArraysStreamMethodTest {
    @Test
    public void test() {
        Integer[] data = {1, 2, 3};
        assertEquals(3, ArraysStreamMethod.createStream(data)
                                          .count());
    }
}
