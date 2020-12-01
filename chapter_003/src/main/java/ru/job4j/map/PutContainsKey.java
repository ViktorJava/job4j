package ru.job4j.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Вставка новых элементов.
 * В классе определенно 2 метода, оба принимают список пользователей.
 * 1. Выполняет вставку значений в отображение без проверки
 * содержится ли такой ключ уже в отображении.
 * 2. Выполняет вставку значений в отображение с проверкой
 * содержится ли такой ключ уже в отображении.
 * Необходимо перебрать весь список и добавить пользователей в отображение,
 * при этом в качестве ключа использовать id пользователя,
 * значения - объект типа User.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 01.12.2020
 */
public class PutContainsKey {
    /**
     * Выполняет вставку значений в отображение без проверки
     * содержится ли такой ключ уже в отображении.
     *
     * @param list Список Пользователей.
     * @return Карта пользователей.
     */
    public static Map<Integer, User> addNewElementWithoutCheck(List<User> list) {
        Map<Integer, User> rsl = new HashMap<>();
        for (User user : list) {
            rsl.put(user.getId(), user);
        }
        return rsl;
    }

    /**
     * Выполняет вставку значений в отображение с проверкой
     * содержится ли такой ключ уже в отображении.
     *
     * @param list Список пользователей.
     * @return Карта пользователей.
     */
    public static Map<Integer, User> addNewElementWithCheck(List<User> list) {
        Map<Integer, User> rsl = new HashMap<>();
        for (User user : list) {
            if (!rsl.containsKey(user.getId())) {
                rsl.put(user.getId(), user);
            }
        }
        return rsl;
    }
}
