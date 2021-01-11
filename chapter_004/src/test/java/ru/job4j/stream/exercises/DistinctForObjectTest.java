package ru.job4j.stream.exercises;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Тест получения списка уникальных элементов типа User.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 25.12.2020
 */
public class DistinctForObjectTest {
    @Test
    public void test() {
        DistinctForObject.User u1 =
                new DistinctForObject.User("A", 20);
        DistinctForObject.User u2 =
                new DistinctForObject.User("A", 25);
        DistinctForObject.User u3 =
                new DistinctForObject.User("B", 30);
        DistinctForObject.User u4 =
                new DistinctForObject.User("B", 30);
        assertEquals(List.of(u1, u2, u3), DistinctForObject.distinct(
                List.of(u1, u2, u3, u4))
        );
    }
}
