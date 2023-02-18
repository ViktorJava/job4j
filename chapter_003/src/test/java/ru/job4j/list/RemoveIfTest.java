package ru.job4j.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Тест метода возвращающий список строк,
 * длинна которых 5 и более символов.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 21.11.2020
 */
public class RemoveIfTest {
    @Test
    public void when() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");
        list.add("one hundred");
        List<String> result = RemoveIf.sortList(list);
        List<String> expected = List.of("three", "seven", "eight", "one hundred");
        assertThat(result, is(expected));
    }
}
