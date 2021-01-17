package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тесты методов класса EasyStream.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 17.01.2021
 */
public class EasyStreamTest {
    @Test
    public void whenEmptySource() {
        var rsl = EasyStream.of(List.of());
        assertThat(rsl, is(List.of()));
    }

    @Test
    public void whenFilledSource() {
        var rsl = EasyStream.of(List.of(1, 2, 3));
        assertThat(rsl, is(List.of(1, 2, 3)));
    }

    @Test
    public void whenFilteredSource() {
        var rsl = EasyStream
                .of(List.of(1, 2, 3))
                .filter(e -> e == 2)
                .collect();
        assertThat(rsl, is(List.of(2)));
    }

    @Test
    public void whenMappedSource() {
        var rsl = EasyStream
                .of(List.of(1, 2, 3))
                .map(e -> e * 2)
                .collect();
        assertThat(rsl, is(List.of(2, 4, 6)));
    }

    @Test
    public void whenFilteredMappedSource() {
        var rsl = EasyStream
                .of(List.of(1, 2, 3))
                .filter(e -> e == 2)
                .map(e -> e * 2)
                .collect();
        assertThat(rsl, is(4));
    }

    @Test
    public void whenMappedFilteredSource() {
        var rsl = EasyStream
                .of(List.of(1, 2, 3))
                .map(e -> e * 2)
                .filter(e -> e == 2)
                .collect();
        assertThat(rsl, is(4));
    }

    @Test
    public void whenMultyFilterSource() {
        var rsl = EasyStream
                .of(List.of(1, 2, 3, 4, 5))
                .filter(e -> e >= 2)
                .filter(e -> e <= 4)
                .collect();
        assertThat(rsl, is(List.of(2, 3, 4)));
    }
}