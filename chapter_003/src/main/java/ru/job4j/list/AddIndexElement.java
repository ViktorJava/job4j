package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Добавление элемента в список по индексу.
 * Реализация метода, который добавляет элемент в список по индексу,
 * при этом он должен добавлять элемент только в том случае, если этого
 * элемента еще нет в коллекции. При этом метод должен вернуть булево значение.
 * Для этого необходимо сравнить размер дубликата списка и списка в который
 * мы добавляем элемент.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 13.11.2020
 */
public class AddIndexElement {
    /**
     * Метод добавляет элемент в список по индексу.
     *
     * @param list  Список элементов.
     * @param index Индекс добавляемого элемента в списке.
     * @param str   Добавляемый элемент в список.
     * @return true в случае удачного добавления, иначе false.
     */
    public static boolean addNewElement(List<String> list, int index, String str) {
        List<String> check = new ArrayList<>(list);
        if (!list.contains(str)) {
            check.add(index, str);
        }
        return list.size() != check.size();
    }
}
