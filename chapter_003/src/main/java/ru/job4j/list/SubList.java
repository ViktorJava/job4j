package ru.job4j.list;

import java.util.List;

/**
 * Получить часть списка с определенными индексами.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 20.11.2020
 */
public class SubList {
    /**
     * Метод принимает два параметра - список и элемент,
     * который предполагается, что содержится в этом списке.
     *
     * @param list Список элементов.
     * @param el   Элемент который возможно содержится в списке элементов.
     * @return Результат:
     * 1. Элемента нет в списке - возвращает пустой список.
     * 2. Элемент в списке встречается 1 раз - возвращает пустой список.
     * 3. Элемент встречается более одного - возвращается список,
     * начиная с первого вхождения элемента и заканчивая
     * предшествующим последнему вхождению элемента в исходной коллекции.
     */
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        return list.subList(list.indexOf(el), list.lastIndexOf(el));
    }
}
