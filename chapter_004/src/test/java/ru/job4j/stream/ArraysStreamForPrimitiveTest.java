package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/**
 * Тест создания стрима из переданного массива.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 13.12.2020
 */
public class ArraysStreamForPrimitiveTest {
    @Test
    public void test() {
        int[] data = {1, 2, 3};
        List<Integer> result = ArraysStreamForPrimitive
                .createStream(data)
                .boxed()
                .collect(Collectors.toList()
                );
        List<Integer> expect = List.of(1, 2, 3);
        assertEquals(expect, result);
    }
}
