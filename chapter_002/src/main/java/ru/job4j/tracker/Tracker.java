package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Класс-обёртка, реализации методов, для работы с объектами типа Item.
 * Данный класс используется, как хранилище для заявок.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 1.2
 * @since 27.10.2019
 */
public class Tracker {

    //Список для хранение заявок.
    //Лучшей практикой считается взаимодействие через интерфейсы,
    // а не через конкретные реализации,
    // что позволяет использовать все преимущества полиморфизма.
    private final List<Item> items = new ArrayList<>();

    /**
     * Метод реализующий создание заявки и присваивание id.
     *
     * @param item новая заявка.
     * @return возвращает добавленный экземпляр класса Item.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(item);
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так-как у заявки нет уникальных полей, для идентификации заявки,
     * будем создавать уникальный ключ id.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(Math.abs(rm.nextLong() + System.currentTimeMillis()));
    }

    /**
     * Редактирование имени заявки.
     *
     * @param id      существующий id заявки.
     * @param newItem новая заявка.
     * @return true если операция завершилась успешно, иначе false.
     */
    public boolean replace(String id, Item newItem) {
        boolean result = false;
        int index = indexOfItem(id);
        newItem.setId(items.get(index).getId());
        if (index != -1) {
            items.set(index, newItem);
            result = true;
        }
        return result;
    }

    /**
     * Метод должен удалить заявку по её id.
     *
     * @param id идентификатор заявки.
     * @return false при неудаче, иначе true.
     */
    public boolean delete(String id) {
        Item item = findById(id);
        return items.remove(item);
    }

    /**
     * Метод возвращает все существующие заявки.
     *
     * @return список заявок.
     */
    public List<Item> findAll() {
        return items;
    }

    /**
     * Поиск заявки по имени.
     *
     * @param key имя заявки.
     * @return заявка в списке.
     */
    public List<Item> findByName(String key) {
        ArrayList<Item> resultName = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                resultName.add(item);
            }
        }
        return resultName;
    }

    /**
     * Поиск заявки по id.
     *
     * @param id идентификатор заявки.
     * @return если Item не найден - возвращает null.
     */
    public Item findById(String id) {
        //FIXME прикрутить новый метод indexOfItem.
        int index = indexOfItem(id);
        return index < 0 ? null : items.get(index);
    }

    /**
     * Поиск Item в ArrayList по заданному id.
     *
     * @param id идентификатор который будем искать.
     * @return индэкс найденного Item или -1 при отсутствии Item.
     */
    private int indexOfItem(String id) {
        int result = -1;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                result = items.indexOf(item);
                break;
            }
        }
        return result;
    }
}
