package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Тесты класса Tracker
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 14.11.2019
 */
public class TrackerTest {

    /**
     * Тест метода add
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Item1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    /**
     * Тест замены заявки
     */
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        //создаём новую заявку.
        Item previous = new Item("test1");
        // Добавляем заявку в трекер. Теперь объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2");
        // Проставляем старый id из previous, который был сгенерирован выше, в новую заявку
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    /**
     * Тест удаления заявки
     */
    @Test
    public void deleteItem() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("test1");
        Item test2 = new Item("test2");
        tracker.add(test1);
        tracker.add(test2);
        assertThat(tracker.delete(test1.getId()), is(true));
        Item[] expected = {test2};
        assertThat(tracker.findAll(), is(expected));
    }

    /**
     * Тест поиска заявки по имени
     */
    @Test
    public void findItemByName() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("test1");
        Item test2 = new Item("test2");
        Item test3 = new Item("test3");
        tracker.add(test1);
        tracker.add(test2);
        tracker.add(test3);
        Item[] expected = {test3};
        assertThat(tracker.findByName(test3.getName()), is(expected));
    }

    /**
     * Тест поиска заявки по id
     */
    @Test
    public void findItemById() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("test1");
        Item test2 = new Item("test2");
        Item test3 = new Item("test3");
        tracker.add(test1);
        tracker.add(test2);
        tracker.add(test3);
        assertThat(tracker.findById(test2.getId()), is(test2));
    }
}