package ru.job4j.list;

import java.util.List;

/**
 * Необходимо реализовать метод, который будет возвращать первую строку
 * из коллекции строк, но прежде чем получить результат - необходимо
 * проверить содержатся ли элементы в списке. Если их нет - возвращаем
 * пустую строку, иначе - первый элемент в коллекции.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 09.11.2020
 */
public class CheckerAhdGetter {
    /**
     * Метод возвращает первую строку из коллекции строк.
     *
     * @param list Коллекция строк.
     * @return Первая строка из коллекции строк.
     */
    public static String getElement(List<String> list) {
        String result = "";
        if (!list.isEmpty()) {
            result = list.get(0);
        }
        return result;
    }
}
