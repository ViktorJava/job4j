package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест получения списка данных типа Integer из массива примитивного типа.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 24.12.2020
 */
public class BoxedMethodTest {
    @Test
    public void test() {
        assertEquals(List.of(1, 2, 3), BoxedMethod.boxed(new int[]{1, 2, 3}));
    }
}
