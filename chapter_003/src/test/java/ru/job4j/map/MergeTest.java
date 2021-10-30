package ru.job4j.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static ru.job4j.map.Merge.User;

/**
 * Объединение значений в Map.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 30.10.2021
 */
public class MergeTest {
    @Test
    public void collectData() {
        Map<Integer, String> names = new HashMap<>(
                Map.of(1, "name1", 2, "name2")
        );
        List<User> users = List.of(
                new User(1, "name1", "surname1"),
                new User(2, "name2", "surname2"),
                new User(3, "name3", "surname3"),
                new User(4, "name4", "surname4")
        );
        Map<Integer, String> rsl = Merge.collectData(names, users);
        Map<Integer, String> expected = Map.of(
                1, "name1 surname1",
                2, "name2 surname2",
                3, "name3 surname3",
                4, "name4 surname4"
        );
        assertThat(rsl, is(expected));
    }
}
