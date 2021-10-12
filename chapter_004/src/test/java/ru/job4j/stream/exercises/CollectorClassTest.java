package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Понятие редукции. Произвольный Collector для сборки в коллекцию.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10/12/2021
 */
public class CollectorClassTest {
    @Test
    public void test() {
        assertEquals(
                List.of(1, 2, 3),
                CollectorClass.collect(List.of(1, 2, 3))
        );
    }
}
