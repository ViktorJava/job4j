package ru.job4j.set;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

import ru.job4j.set.UniqueName.*;

/**
 * Тест метода определяющего количество уникальных имён,
 * которые имеют пользователи.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 27.11.2020
 */
public class UniqueNameTest {
    @Test
    public void collectUniqueName() {
        List<User> users = List.of(
                new User(1, "name1"),
                new User(2, "name2"),
                new User(3, "name1"),
                new User(4, "name3"),
                new User(5, "name5"),
                new User(6, "name3")
        );
        int rsl = UniqueName.collectUniqueName(users);
        int expected = 4;
        assertThat(rsl, is(expected));
    }
}
