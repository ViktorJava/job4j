package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

/**
 * Тест получения первого элемента из списка данных.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 24.12.2020
 */
public class FindFirstMethodTest {
    @Test
    public void test() {
        assertEquals(Optional.empty(), FindFirstMethod.first(List.of()));
        assertEquals(Optional.of(1), FindFirstMethod.first(List.of(1)));
    }
}
