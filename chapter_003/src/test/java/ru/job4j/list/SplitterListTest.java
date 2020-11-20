package ru.job4j.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Тест удаления одного списка из другого.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 19.11.2020
 */
public class SplitterListTest {
    @Test
    public void split() {
        List<String> left = new ArrayList<>();
        left.add("one");
        left.add("two");
        left.add("three");
        left.add("four");
        left.add("five");
        left.add("six");
        left.add("seven");
        left.add("eight");
        left.add("nine");
        left.add("ten");
        List<String> midle = List.of("one", "two", "four", "five", "seven", "eight", "nine");
        List<String> right = List.of("two", "five", "nine");
        List<String> result = SplitterList.split(left, midle, right);
        assertThat(result, is(List.of("one", "four", "seven", "eight")));
    }
}
