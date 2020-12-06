package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тест вывода нечётных чисел массива в порядке возрастания их индекса.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 06.12.2020
 */
public class OddPrintTest {
    @Test
    public void whenNonEmpty() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        OddPrint.print(new int[]{1, 2, 3});
        String ln = System.lineSeparator();
        assertThat(out.toString(), is("1" + ln
                + "3" + ln
        ));
    }

    @Test
    public void whenEmpty() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        OddPrint.print(new int[]{2, 4, 6});
        assertThat(out.toString(), is(""));
    }
}
