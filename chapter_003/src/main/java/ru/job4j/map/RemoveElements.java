package ru.job4j.map;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Удаление пар ключ-значение из отображения.
 * Утилитный финальный класс.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 01.11.2021
 */
public final class RemoveElements {
    /**
     * Закрыт дефолтный конструктор, т.к. класс утилитный.
     */
    private RemoveElements() {
    }

    /**
     * Метод обновляет информацию в отображении data следующим образом:
     * Удалить все пары ключ-значение которые соответствуют
     * каждому id из ids списка id.
     * Удалить все пары ключ значения, которые соответствуют списку
     * пользователей users.
     *
     * @param data  Отображение(id пользователя, имя пользователя)
     * @param ids   Список id пользователей.
     * @param users Список пользователей.
     * @return Обновлённое отображение.
     */
    public static Map<Integer, String> removeElement(final Map<Integer, String> data,
                                                     final List<Integer> ids,
                                                     final List<User> users) {
        for (Integer id: ids) {
            data.remove(id);
        }
        for (User user: users) {
            data.remove(user.getId(), user.getName());
        }
        return data;
    }

    /**
     * Inner Nested Class.
     */
    public static class User {
        /**
         * id пользователя.
         */
        private final int id;
        /**
         * Имя пользователя.
         */
        private final String name;

        /**
         * Конструктор.
         *
         * @param id   Идентификатор пользователя.
         * @param name Имя пользователя.
         */
        public User(final int id, final String name) {
            this.id = id;
            this.name = name;
        }

        /**
         * Гетер id.
         *
         * @return id пользователя.
         */
        public int getId() {
            return id;
        }

        /**
         * Гетер имени пользователя.
         *
         * @return Имя пользователя.
         */
        public String getName() {
            return name;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return id == user.id && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }
}
