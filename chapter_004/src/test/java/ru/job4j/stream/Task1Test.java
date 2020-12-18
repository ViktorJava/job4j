package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест удаления из списка чисел кратных четырём.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 17.12.2020
 */
public class Task1Test {
    @Test
    public void test() {
        assertEquals(Task1.retain(
                List.of(1, 2, 3, 5, 6, 7)), Task1.retain(
                List.of(1, 2, 3, 4, 5, 6, 7, 8)));
        assertEquals(Task1.retain(
                List.of(1, 2, 3)), Task1.retain(
                List.of(1, 2, 3)));
        assertEquals(Task1.retain(List.of()), Task1.retain(List.of()));
        assertEquals(Task1.retain(List.of()), Task1.retain(List.of(4, 8)));
    }
}
