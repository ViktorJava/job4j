package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Понятие редукции. Произвольный Collector для подсчета.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10/12/2021
 */
public class CollectorAriphmeticTest {
    @Test
    public void whenWithout0() {
        int out = CollectorAriphmetic.collect(List.of(1, 2, 3));
        assertEquals(6, out);
    }

    @Test
    public void whenWith0() {
        int out = CollectorAriphmetic.collect(List.of(0, 2, 3));
        assertEquals(0, out);
    }
}
    