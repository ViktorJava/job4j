package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


/**
 * Тесты демонстрирующие сортировку данных по возрастанию и по убыванию.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 19.05.2020
 */
public class ItemTest {
    @Test
    public void thenNameSortIncrease() {
        Tracker tracker = new Tracker();
        Item item3 = new Item("Item3");
        Item item1 = new Item("Item1");
        Item item2 = new Item("Item2");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.findAll().sort(new NameSortInc());
        assertThat(tracker.findAll(), is(Arrays.asList(item1, item2, item3)));
    }

    @Test
    public void thenNameSortDecrease() {
        Tracker tracker = new Tracker();
        Item item3 = new Item("Item3");
        Item item1 = new Item("Item1");
        Item item2 = new Item("Item2");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.findAll().sort(new NameSortDec());
        assertThat(tracker.findAll(), is(Arrays.asList(item3, item2, item1)));
    }

}
