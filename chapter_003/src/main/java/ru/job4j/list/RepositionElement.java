package ru.job4j.list;

import java.util.List;

/**
 * Удаление и замена элементов в списке.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 19.11.2020
 */
public class RepositionElement {
    /**
     * Метод принимает в качестве параметров список и индекс элемента
     * который необходимо заменить. Сначала удаляется последний элемент в списке,
     * а потом этим элементом заменяется элемент по индексу,
     * который пришел в параметрах метода. Учитывается,
     * что извне может прийти индекс, который превышает значение размера списка.
     *
     * @param list  Список значений.
     * @param index Индекс элемента который необходимо заменить.
     * @return Список с выполненной заменой и удалением данных.
     */
    public static List<String> changePosition(List<String> list, int index) {
        if (index > list.size()) {
            list.remove(list.size() - 1);
            return list;
        }
        list.set(index, list.remove(list.size() - 1));
        return list;
    }
}
