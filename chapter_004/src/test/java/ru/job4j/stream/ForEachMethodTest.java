package ru.job4j.stream;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест вывода на консоль, элементов стрима, целочисленного типа.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 23.12.2020
 */
public class ForEachMethodTest {
    @Test
    public void test() {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(buffer);
        System.setOut(out);
        ForEachMethod.show(List.of(1, 2, 3)
                               .stream());
        String nl = System.lineSeparator();
        String expect = "1" + nl + "2" + nl + "3" + nl;
        assertEquals(expect, buffer.toString());
    }
}
