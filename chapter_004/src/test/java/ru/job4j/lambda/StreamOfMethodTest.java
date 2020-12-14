package ru.job4j.lambda;

import org.junit.Test;

import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/**
 * Тесть метода создания стрима.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 14.12.2020
 */
public class StreamOfMethodTest {
    @Test
    public void whenUserStreamMethod() {
        assertEquals("abc",
                StreamOfMethod.createStream()
                              .map(Object::toString)
                              .collect(Collectors.joining()));
    }
}
