package ru.job4j.stream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Промежуточные операции. Метод flatMapToInt(). Сумма чисел матрицы.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10/11/2021
 */
public class FlatMapForPrimitiveTest {
    @Test
    public void test() {
        assertEquals(
                15,
                FlatMapForPrimitive.sum(new int[][]{
                        {1, 2, 3},
                        {4, 5}
                })
        );
    }
}
