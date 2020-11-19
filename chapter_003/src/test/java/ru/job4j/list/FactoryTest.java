package ru.job4j.list;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тесты заполнения списка фабричным методом.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 19.11.2020
 */
public class FactoryTest {
    @Test
    public void main() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Factory.main(null);
        String ln = System.lineSeparator();
        String expected = "first" + ln + "second"
                + ln + "third"
                + ln + "fourth"
                + ln + "fifth" + ln;
        assertThat(out.toString(), is(expected));
    }
}
