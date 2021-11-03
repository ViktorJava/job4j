package ru.job4j.map;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Индексы символов.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 02.11.2021
 */
public class ConcordanceTest {
    @Test
    public void collectCharacters() {
        String str = "Hello World";
        Map<Character, List<Integer>> rsl = Concordance.collectCharacters(str);
        Map<Character, List<Integer>> expected = Map.of(
                'r', List.of(7),
                'd', List.of(9),
                'e', List.of(1),
                'W', List.of(5),
                'H', List.of(0),
                'l', List.of(2, 3, 8),
                'o', List.of(4, 6)
        );
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectCharactersSecondVar() {
        String str = "Hello World hello world";
        Map<Character, List<Integer>> rsl = Concordance.collectCharacters(str);
        Map<Character, List<Integer>> expected = Map.of(
                'r', List.of(7, 17),
                'd', List.of(9, 19),
                'e', List.of(1, 11),
                'W', List.of(5),
                'w', List.of(15),
                'H', List.of(0),
                'h', List.of(10),
                'l', List.of(2, 3, 8, 12, 13, 18),
                'o', List.of(4, 6, 14, 16)
        );
        assertThat(rsl, is(expected));
    }
}
