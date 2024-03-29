package ru.job4j.search;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тест того случая, когда задачи сортируются в связанном списке,
 * согласно приоритету задачи, в порядке уменьшения приоритетности.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.2
 * @since 13.05.2020
 */
public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        var queue = new PriorityQueue();
        queue.put(new Task("extra", 2));
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        var result = queue.take();
        assertThat(result.getDescription(), is("urgent"));
    }
}
