package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.List;
import java.util.StringJoiner;

import static org.junit.Assert.assertEquals;

/**
 * Тест сборки строки из списка строк.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 16.12.2020
 */
public class JoiningMethodTest {
    @Test
    public void test() {
        StringJoiner expected = new StringJoiner(System.lineSeparator(),
                "prefix", "suffix");
        expected.add("A");
        expected.add("B");
        expected.add("C");
        assertEquals(expected.toString(), JoiningMethod.join(List.of(
                "A", "B", "C"
        )));
    }
}
