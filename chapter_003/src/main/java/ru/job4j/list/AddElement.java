package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Размер списка и добавление элементов.
 * Необходимо реализовать метод, который добавляет
 * элемент в список и сообщает нам удалось это или нет,
 * т.е. метод должен вернуть булево значение.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10.11.2020
 */
public class AddElement {
    /**
     * Метод добавляет элемент в список
     * и сообщает, удалось это или нет.
     *
     * @param list Список.
     * @param str  Добавляемый элемент в список.
     * @return true в случае удачного добавления
     * иначе false.
     */
    public static boolean addNewElement(List<String> list, String str) {
        List<String> chec = new ArrayList<>(list);
        chec.add(str);
        return chec.size() != list.size();
    }
}
