package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тест класса печатающего элементы массива,
 * пропуская в каждом ряду, первый и последний элементы.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 18.11.2020
 */
public class LoopForBoardTest {
    @Test
    public void main() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        LoopForBoard.main(null);
        String ln = System.lineSeparator();
        String expected = "2" + ln + "3" + ln + "6" + ln + "7" + ln;
        assertThat(out.toString(), is(expected));
    }
}
