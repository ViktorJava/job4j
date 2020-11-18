package ru.job4j.list;

import java.util.List;

/**
 * Найти индекс элемента.
 * Метод принимает список и элемент который мы ищем в списке.
 * Необходимо определить, является ли этот элемент уникальным в этом списке.
 * Для это необходимо найти первый и последний индекс вхождения элемента.
 * Если равны - значит элемент уникальный. Необходимо предусмотреть ситуацию,
 * что такого элемента нет вообще в коллекции,
 * в этом случае также нужно вернуть false.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 18.11.2020
 */
public class UniqueElement {
    /**
     * Метод определяет уникальность элемента в списке.
     *
     * @param list Список для проверки на уникальность элементов.
     * @param str  Элемент который мы ищем в списке.
     * @return При уникальности элемента, возвращается true иначе false.
     */
    public static boolean checkList(List<String> list, String str) {
        if (list.contains(str)) {
            return list.indexOf(str) == list.lastIndexOf(str);
        }
        return false;
    }
}
