package ru.job4j.stream;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тест обхода массива данных, целочисленного типа.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 22.12.2020
 */
public class StreamIterateTest {
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Integer[] data = {1, 2, 3, 4};
        StreamIterate.showArray(data);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is("1" + ln + "3" + ln));
    }
}
