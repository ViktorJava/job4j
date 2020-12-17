package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест фильтра списка объектов типа User.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 17.12.2020
 */
public class FilterObjectTest {
    @Test
    public void test() {
        List<FilterObject.User> users = List.of(
                new FilterObject.User("Ivan", 20),
                new FilterObject.User("Boris", 19),
                new FilterObject.User("Benjamin", 18));
        FilterObject.User user = FilterObject.filter(users)
                                             .iterator()
                                             .next();
        assertEquals("Boris", user.getName());
        assertEquals(19, user.getAge());
    }
}
