package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * Класс реализации методов для работы с обьектами типа Item.
 * Данный класс используется, как хранилище для заявок.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 27.10.2019
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];
    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализующий добавление заявки в хранилище
     *
     * @param item новая заявка
     * @return возвращает добавленный экземпляр класса item
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так-как у заявки нет уникальных полей, для идентификации заявки,
     * будем создавать уникальный ключ id.
     *
     * @return Уникальный ключ
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(Math.abs(rm.nextLong() + System.currentTimeMillis()));
    }

    /**
     * Метод заменяет ячейку в массиве this.items[].
     * Для этого находим ячейку по id
     *
     * @param id   идентификатор ячейки в массиве объектов
     * @param item обьект item (товар)
     * @return true если операция завершилась удачно
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        /**
         * Одна причина использования id.equals("") или id.length() == 0 но не id.isEmpty() заключается в том,
         * что метод id.isEmpty() был введен в Java 1.6. (короче говоря, совместимость и всё такое)
         */
        if (this.position > 0 && id.length() != 0 && item != null) {
            int index = 0;
            while (index < this.position) {
                if (items[index].getId().equals(id)) {
                    this.items[index] = item;
                    item.setId(id);
                    result = true;
                    break;
                }
                index++;
            }
        }
        return result;
    }

    /**
     * Метод должен удалить ячейку в массиве this.items[]. Для этого необходимо найти ячейку в массиве по id.
     * Далее сместить все значения справа от удаляемого элемента - на одну ячейку влево с помощью System.arraycopy().
     *
     * @param id идентификатор ячейки в массиве объектов
     * @return true если операция завершилась успешно
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int index = 0; index < this.position; index++) {
            if (items[index].getId().equals(id)) {
                System.arraycopy(items, index + 1, items, index, items.length - index - 1);
                position--;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод возвращает копию массива this.items[] без null элементов.
     *
     * @return массив классов.
     */
    public Item[] findAll() {
        Item[] result = Arrays.copyOf(items, this.position);
        return result;
    }

    /**
     * Метод проверяет в цикле все элементы массива this.items[], сравнивая name
     * (используя метод getName класса Item) с аргументом метода String key.
     * Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его;
     *
     * @param key имя поиска
     * @return массив классов.
     */
    public Item[] findByName(String key) {
        int count = 0;
        Item[] result = new Item[this.position];
        for (int index = 0; index < this.position; index++) {
            if (items[index].getName().equals(key)) {
                result[count++] = this.items[index];
            }
        }
        return Arrays.copyOf(result, count);
    }

    /**
     * Метод проверяет в цикле все элементы массива this.items[],
     * сравнивая id с аргументом String id и возвращает найденный Item.
     *
     * @param id идентификатор искомого объекта.
     * @return Если Item не найден - возвращает null.
     */
    public Item findById(String id) {
        Item result = null;
        for (int index = 0; index < this.position; index++) {
            if (items[index].getId().equals(id)) {
                result = items[index];
            }
        }
        return result;
    }
}