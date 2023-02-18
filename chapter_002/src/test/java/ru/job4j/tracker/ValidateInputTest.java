package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Тестирование класса ValidateInput.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 21.12.2019
 */
public class ValidateInputTest {
    @Test
    public void whenInvalidInput() {
        ByteArrayOutputStream mem = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(mem));
        ValidateInput input = new ValidateInput(new StubInput(new String[]{"stupid", "0"}));
        input.askInt("Enter", 1);
        assertThat(mem.toString(), is(
                String.format("Enter%nPlease enter validate data again.%nEnter%n"))
        );
        System.setOut(out);
    }

    @Test
    public void outOfBound() {
        ByteArrayOutputStream mem = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(mem));
        ValidateInput input = new ValidateInput(new StubInput(new String[]{"3", "0"}));
        input.askInt("Enter", 1);
        assertThat(mem.toString(), is(
                String.format("Enter%nPlease select key from menu.%nEnter%n")));
        System.setOut(out);
    }
}
