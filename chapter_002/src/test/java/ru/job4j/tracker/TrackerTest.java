package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Тесты класса Tracker
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 1.2
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
     * Создаём новуые заявки (item1,item2).
     * Добавляем заявки в трекер, присваивается id.
     * Создаем новую заявку (newItem) без id.
     * Проставляем старый id, заявки item2, в новую заявку newItem.
     * Обновляем заявку в трекере.
     * Проверяем, что имя заявки изменилось с item2 на newItem.
     */
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("item1");
        Item item2 = new Item("item2");
        tracker.add(item1);
        tracker.add(item2);
        Item newItem = new Item("newItem");
        tracker.replace(item2.getId(), newItem);
        assertThat(tracker.findById(item2.getId()).getName(), is("newItem"));
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
