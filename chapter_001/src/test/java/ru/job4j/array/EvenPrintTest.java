package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Тест вывода чётных чисел в порядке убывания индексов.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 06.12.2020
 */
public class EvenPrintTest {
    @Test
    public void whenNonEmpty() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        EvenPrint.print(new int[]{1, 2, 3, 4});
        String ln = System.lineSeparator();
        assertThat(out.toString(), is("4" + ln
                + "2" + ln
        ));
    }

    @Test
    public void whenEmpty() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        EvenPrint.print(new int[]{1, 3, 5});
        assertThat(out.toString(), is(""));
    }
}
