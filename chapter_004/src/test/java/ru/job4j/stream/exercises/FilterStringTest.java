package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест фильтрации списка строк по заданному признаку.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 17.12.2020
 */
public class FilterStringTest {
    @Test
    public void test() {
        List<String> list = List.of("Abc.java", "abc.java", "Abc");
        assertEquals(List.of("Abc.java"), FilterString.filter(list));
    }
}
