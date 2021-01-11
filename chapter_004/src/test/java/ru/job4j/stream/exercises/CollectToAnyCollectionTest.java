package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест создания из стрима, коллекции LinkedHashSet.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 21.12.2020
 */
public class CollectToAnyCollectionTest {
    @Test
    public void test() {
        List<Integer> data = List.of();
        String expectClass = "java.util.LinkedHashSet";
        String resultClass = CollectToAnyCollection.collect(data.stream())
                                                   .getClass()
                                                   .getName();
        assertEquals(expectClass, resultClass);
    }
}
