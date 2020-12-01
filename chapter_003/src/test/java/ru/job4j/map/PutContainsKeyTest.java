package ru.job4j.map;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import ru.job4j.map.PutContainsKey.User;

/**
 * Тесты добавления данных типа User в карту.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 01.12.2020
 */
public class PutContainsKeyTest {
    /**
     * Добавление данных в Map, с проверкой ключа.
     */
    @Test
    public void addNewElement() {
        User one = new User(1, "name1");
        User two = new User(2, "name 2");
        User three = new User(1, "name3");
        List<User> list = List.of(one, two, three);
        Map<Integer, User> map = PutContainsKey.addNewElementWithCheck(list);
        Map<Integer, User> expect = Map.of(1, one, 2, two);
        assertThat(map, is(expect));
    }

    /**
     * Добавление данных в Map, без проверки ключа.
     */
    @Test
    public void addNewElementWithoutCheck() {
        User one = new User(1, "name1");
        User two = new User(2, "name 2");
        User three = new User(1, "name 3");
        List<User> list = List.of(one, two, three);
        Map<Integer, User> map = PutContainsKey.addNewElementWithoutCheck(list);
        Map<Integer, User> expect = Map.of(1, three, 2, two);
        assertThat(map, is(expect));
    }
}
