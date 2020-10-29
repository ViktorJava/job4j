package ru.job4j.loop;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Тесты вывода на консоль чисел от M до N.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 29.10.2020
 */
public class BackwardForTest {
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        BackwardFor.out(5, 1);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "5" + ln
                        + "4" + ln
                        + "3" + ln
                        + "2" + ln
        ));
    }
}
