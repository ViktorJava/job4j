package ru.job4j.list;

import java.util.List;

/**
 * Удаление элементов по условию.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 21.11.2020
 */
public class RemoveIf {
    /**
     * Метод, который возвращает список строк, состоящих из 5 и более символов.
     *
     * @param list Список строк.
     * @return Список строк из 5 символов.
     */
    public static List<String> sortList(List<String> list) {
        list.removeIf(e -> e.length() < 5);
        return list;
    }
}
