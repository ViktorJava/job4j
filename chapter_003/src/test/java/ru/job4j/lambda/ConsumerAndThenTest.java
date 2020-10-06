package ru.job4j.lambda;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Тест двух совмещённых Consumer.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 06.10.2020
 */
public class ConsumerAndThenTest {

    @Test
    public void test() {
        PrintStream out = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(buffer);
        System.setOut(printStream);
        String input = "job4j";
        String expect = String.format("%s%s", input, System.lineSeparator());
        ConsumerAndThen.consumer(input).accept(input);
        Assert.assertEquals(expect, buffer.toString());
        System.setOut(out);
    }
}
