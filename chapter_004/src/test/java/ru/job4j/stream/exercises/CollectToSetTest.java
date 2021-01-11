package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 15.12.2020
 */
public class CollectToSetTest {
    @Test
    public void test() {
        Set<Integer> input = Set.of(1, 2, 3);
        Set<Integer> expected = Set.of(1, 2, 3);
        assertEquals(expected, CollectToSet.collect(input.stream()));
    }
}
