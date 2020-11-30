package ru.job4j.comparator;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест естественного null-friendly компаратора.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 30.11.2020
 */
public class NullLastMethodTest {
    @Test
    public void test() {
        List<String> list = Arrays.asList(null, "c", "b", "a", null);
        list.sort(NullLastMethod.nullLast());
        List<String> expected = Arrays.asList("a", "b", "c", null, null);
        assertEquals(expected, list);
    }
}
