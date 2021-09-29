package ru.job4j.comparator;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Получение компаратора. Метод thenComparing.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/29/2021
 */
public class ThenComparingMethodTest {
    @Test
    public void test() {
        ThenComparingMethod.User user1 = new ThenComparingMethod.User("C", 10);
        ThenComparingMethod.User user2 = new ThenComparingMethod.User("B", 20);
        ThenComparingMethod.User user3 = new ThenComparingMethod.User("A", 15);
        ThenComparingMethod.User user4 = new ThenComparingMethod.User("B", 11);
        ThenComparingMethod.User user5 = new ThenComparingMethod.User("A", 12);
        List<ThenComparingMethod.User> input = Arrays.asList(user1, user2, user3, user4, user5);
        List<ThenComparingMethod.User> expect = Arrays.asList(user3, user5, user2, user4, user1);
        input.sort(ThenComparingMethod.thenComparing());
        assertEquals(expect, input);
    }
}
