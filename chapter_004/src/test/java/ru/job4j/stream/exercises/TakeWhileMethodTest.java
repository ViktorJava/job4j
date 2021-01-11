package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест получения списка отрицательных значений целочисленного типа.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 25.12.2020
 */
public class TakeWhileMethodTest {
    @Test
    public void test() {
        assertEquals(List.of(-2, -1), TakeWhileMethod.takeWhile(
                List.of(-1, 2, 3, 4, -2))
        );
    }
}
