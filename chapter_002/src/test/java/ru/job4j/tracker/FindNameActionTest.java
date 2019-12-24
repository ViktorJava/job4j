package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Тестирование метода FindNameAction().
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 19.12.2019
 */
public class FindNameActionTest {
    @Test
    public void findByName() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Item item = new Item("fix bug");
        tracker.add(item);
        FindNameAction act = new FindNameAction();
        act.execute(new StubInput(new String[]{"fix bug"}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), System.lineSeparator(), System.lineSeparator())
                .add("--- Find items by name ---")
                .add("please wait...")
                .add("[name]: " + item.getName() + " [id]: " + item.getId())
                .add("(Info) search over" + System.lineSeparator())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);

    }

}