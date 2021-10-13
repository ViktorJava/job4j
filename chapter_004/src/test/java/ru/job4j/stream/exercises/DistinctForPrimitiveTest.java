package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Промежуточные операции. Метод distinct(). Уникальные числа.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 25.12.2020
 */
public class DistinctForPrimitiveTest {
    @Test
    public void test() {
        assertEquals(List.of(1, 2, 3),
                DistinctForPrimitive.collect(new int[]{1, 2, 3, 1, 2, 3}));
    }
}
