package ru.job4j.list;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Тест итератора для спика.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 21.11.2020
 */
public class IteratorForListTest {
    @Test
    public void when() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        IteratorForList.main(null);
        String ln = System.lineSeparator();
        String expected = "Next element has - true, this element is one" + ln
                + "Next element has - true, this element is two" + ln
                + "Next element has - true, this element is three" + ln
                + "Next element has - true, this element is four" + ln
                + "Next element has - true, this element is five" + ln
                + "Next element has - false" + ln;
        assertThat(out.toString(), is(expected));
    }
}
