package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест получения списка элементов целочисленного  типа,
 * только положительного значения.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 25.12.2020
 */
public class DropWhileMethodTest {
    @Test
    public void test() {
        assertEquals(List.of(1, 3), DropWhileMethod.dropWhile(
                List.of(1, 3, -5, -2))
        );
    }
}
