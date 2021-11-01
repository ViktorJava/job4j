package ru.job4j.map;

import org.junit.Test;

import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Массив строк с повторяющимися значениями.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 01.11.2021
 */
public class NonUniqueStringTest {
    @Test
    public void checkData() {
        String[] data = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> rsl = NonUniqueString.checkData(data);
        Map<String, Boolean> expected = Map.of(
                "a", true, "b", true, "c", false);
        assertThat(rsl, is(expected));
    }
}
