package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест промежуточной операции limit.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 17.12.2020
 */
public class LimitMethodTest {
    @Test
    public void test() {
        List<String> data = List.of("A", "B", "C");
        assertEquals(List.of("A", "B", "C"), LimitMethod.firstThree(data));
    }
}
