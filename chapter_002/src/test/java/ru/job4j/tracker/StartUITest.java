package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

/**
 * Класс прозрачного тестирования.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 03.12.2019
 */
public class StartUITest {
    /**
     * Тест операции создания заявки
     */
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item create = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(create.getName(), is(expected.getName()));
    }

    /**
     * Тест операции удаления заявки
     */
    @Test
    public void whenDeleteItem() {
        Item item = new Item("new item");
        Tracker tracker = new Tracker();
        tracker.add(item);
        String[] answers = {item.getId()};
        Input input = new StubInput(answers);
        StartUI.deleteItem(input, tracker);
        Item result = tracker.findById(item.getId());
        assertEquals(result, null);
//        Item expected = null;
//        assertThat(result, is(expected));
    }

    /**
     * Тест операции замены (исправления) заявки
     */
    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {item.getId(), "replaced item"};
        Input input = new StubInput(answers);
        StartUI.replaceItem(input, tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }
}