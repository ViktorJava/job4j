package ru.job4j.stream;

import org.junit.Test;
import ru.job4j.stream.CountingMethod.Company;
import ru.job4j.stream.CountingMethod.Worker;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Тест подсчёта количества работников в каждой компании.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 20.12.2020
 */
public class CountingMethodTest {
    @Test
    public void test() {
        Company c1 = new Company("Apple");
        Company c2 = new Company("Microsoft");
        Company c3 = new Company("Amazon");

        Worker w1 = new Worker(20, c1);
        Worker w2 = new Worker(25, c1);
        Worker w3 = new Worker(30, c2);
        Worker w4 = new Worker(35, c3);
        Worker w5 = new Worker(40, c3);

        Map<String, Long> expected = Map.of(
                "Apple", 2L,
                "Microsoft", 1L,
                "Amazon", 2L
        );
        assertEquals(expected, CountingMethod.groupAndCount(List.of(
                w1, w2, w3, w4, w5))
        );
    }
}
