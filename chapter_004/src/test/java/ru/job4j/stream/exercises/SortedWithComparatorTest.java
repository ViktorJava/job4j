package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест сортировки списка строк по убыванию.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 26.12.2020
 */
public class SortedWithComparatorTest {
    @Test
    public void test() {
        assertEquals(List.of("c", "b", "a"), SortedWithComparator.sorted(
                List.of("a", "b", "c"))
        );
    }
}
