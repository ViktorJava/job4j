package ru.job4j.lambda;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Тесты метода ifPresent()
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 21.10.2020
 */
public class OptionalIfPresentTest {
    @Test
    public void whenExist() {
        PrintStream before = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(buffer);
        System.setOut(out);
        OptionalIfPresent.ifPresent(new int[]{1, 2, 3});
        assertEquals(
                "Max: 3" + System.lineSeparator(),
                buffer.toString()
        );
        System.setOut(before);
    }

    @Test
    public void whenNotExist() {
        PrintStream before = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(buffer);
        System.setOut(out);
        OptionalIfPresent.ifPresent(new int[]{});
        assertEquals(
                "",
                buffer.toString()
        );
        System.setOut(before);
    }

    @Test
    public void whenMax5() {
        PrintStream before = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(buffer);
        System.setOut(out);
        OptionalIfPresent.ifPresent(new int[]{1, 2, 5, 3, 4});
        assertEquals(
                "Max: 5" + System.lineSeparator(),
                buffer.toString()
        );
        System.setOut(before);
    }
}
