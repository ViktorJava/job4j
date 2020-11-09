package ru.job4j.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


/**
 * Тесты метода, который будет возвращать первую строку
 * из коллекции строк.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 09.11.2020
 */
public class CheckerAhdGetterTest {
    @Test
    public void whenGetNull() {
        List<String> list = new ArrayList<>();
        String result = CheckerAhdGetter.getElement(list);
        String expected = "";
        assertThat(result, is(expected));
    }

    @Test
    public void whenGetFirstElement() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        String result = CheckerAhdGetter.getElement(list);
        String expected = "first";
        assertThat(result, is(expected));
    }
}
