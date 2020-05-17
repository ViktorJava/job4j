package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Тесты класса Tracker
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 1.1
 * @since 14.11.2019
 */
public class TrackerTest {

    /**
     * Тест метода add.
     * Формируем заявку в трекере.
     * Ищем заявку по id, запрашиваем её имя.
     * Сверяем имена созданной заявки и найденой заявки в трекере.
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
     * Тест замены заявки.
     * Создаём новую заявку (test1).
     * Добавляем заявку в трекер. Теперь объект проинициализирован id.
     * Создаем новую заявку (test2).
     * Проставляем старый id заявки test1, в новую заявку.
     * Обновляем заявку в трекере.
     * Проверяем, что заявка с таким id имеет новые имя test2.
     */
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1");
        tracker.add(previous);
        Item next = new Item("test2");
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    /**
     * Тест удаления заявки.
     * Создаём две заявки и отправляем в трекер, присваивая
     * заявкам id. Удаляем первую заявку (по id).
     * Ищём все оставшиеся заявки в трекере.
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
        assertThat(tracker.findAll(), is(Arrays.asList(expected)));
    }

    /**
     * Тест поиска заявки по имени.
     * Формируем три заявки (test1,test2,test3).
     * Добавляем четыри заявки в трекер, две заявки с одинаковым именем.
     * Ищем заявку по имени. Проверяем поиск двух заявок с одинаковым именем.
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
        tracker.add(test1);
        Item[] expected = {test1, test1};
        assertThat(tracker.findByName(test1.getName()), is(Arrays.asList(expected)));
    }

    /**
     * Тест поиска заявки по id.
     * Формируем три заявки. Добавляем в трекер.
     * Ищем вторую заявку по id
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

    /**
     * Тест поиска всех заявок в трекере.
     * Создаём три заявки, добавляем в трекер четыри заявки,
     * из них две копии (test2).
     * Находим в трекере четыри заявки.
     */
    @Test
    public void whenFindAllThenFindAll() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("test1");
        Item test2 = new Item("test2");
        Item test3 = new Item("test3");
        tracker.add(test1);
        tracker.add(test2);
        tracker.add(test3);
        tracker.add(test2);
        Item[] expected = {test1, test2, test3, test2};
        assertThat(tracker.findAll(), is(Arrays.asList(expected)));
    }
}
