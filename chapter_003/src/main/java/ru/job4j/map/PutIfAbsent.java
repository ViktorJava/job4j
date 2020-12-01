package ru.job4j.map;

import java.util.Map;
import java.util.Objects;

/**
 * Добавление элемента в отображение без проверки.
 * Необходимо реализовать метод {@code boolean addNewElement(User user)},
 * который осуществит добавление нового элемента только при условии,
 * что такого ключа в отображении еще нет. При этом метод должен вернуть
 * булево значение - для этого необходимо проверить содержит ли отображение
 * значение user. В отображении ключом является id пользователя,
 * значением - объект типа User.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 01.12.2020
 */
public class PutIfAbsent {
    private final Map<Integer, User> users;

    public PutIfAbsent(Map<Integer, User> users) {
        this.users = users;
    }

    /**
     * Добавление без дополнительной проверки, нового пользователя, в Map.
     *
     * @param user Новый пользователь.
     * @return true если пользователь существует в Map, иначе false.
     */
    public boolean addNewElement(User user) {
        users.putIfAbsent(user.getId(), user);
        return users.containsValue(user);
    }

    /**
     * Модель данных.
     */
    public static class User {
        private final String name;
        private final int id;

        public User(int id, String name) {
            this.name = name;
            this.id = id;
        }

        public int getId() {
            return id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "User{" + "name='" + name + '\'' + ", id=" + id + '}';
        }
    }
}
