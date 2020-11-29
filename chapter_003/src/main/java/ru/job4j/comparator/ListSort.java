package ru.job4j.comparator;

import java.util.Comparator;
import java.util.List;

/**
 * Сортировка List.
 * Отсортировать список строк. В списке могут быть null элементы,
 * они должны оказаться в конце после сортировки.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 29.11.2020
 */
public class ListSort {
    /**
     * Метод сортировки списка строк с null элементами.
     *
     * @param data Список строк.
     * @return Отсортированный список строк.
     */
    public static List<String> sort(List<String> data) {
        data.sort(Comparator.nullsLast(Comparator.reverseOrder()));
        return data;
    }
}
