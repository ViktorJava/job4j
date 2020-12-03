package ru.job4j.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Тестирование метода объединения значений одного отображения со значениями
 * второго отображения.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 03.12.2020
 */
public class ComputeIfPresentTest {
    @Test
    public void collectData() {
        Map<Integer, String> name = new HashMap<>(
                Map.of(
                        1, "Bill",
                        2, "Donald")
        );
        Map<Integer, String> surname = new HashMap<>(
                Map.of(
                        1, "Clinton",
                        2, "Trump")
        );
        Map<Integer, String> rsl = ComputeIfPresent.collectData(name, surname);
        Map<Integer, String> expect = Map.of(1, "Bill Clinton", 2, "Donald Trump");
        assertThat(rsl, is(expect));
    }
}
