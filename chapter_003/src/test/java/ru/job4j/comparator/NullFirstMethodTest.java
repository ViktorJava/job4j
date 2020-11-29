package ru.job4j.comparator;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест компаратора строки, натурального порядка, null-friendly.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 29.11.2020
 */
public class NullFirstMethodTest {
    @Test
    public void test() {
        List<String> list = Arrays.asList("3", "2", "1", null);
        list.sort(NullFirstMethod.nullFirst());
        assertEquals(Arrays.asList(null, "1", "2", "3"), list);
    }
}
