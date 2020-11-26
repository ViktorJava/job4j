package ru.job4j.set;

import java.util.*;

/**
 * Уникальные имена.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 27.11.2020
 */
public class UniqueName {
    /**
     * Метод принимает список пользователей, при этом много пользователей
     * могут иметь одинаковое имя. Метод должен определить количество
     * уникальных имен, которые имеют пользователи.
     *
     * @param users Список пользователей.
     * @return Количество уникальных имен.
     */
    public static int collectUniqueName(List<User> users) {
        Set<User> set = new HashSet<>();
        int count = 0;
        for (User user : users) {
            if (set.add(user)) {
                count++;
            }
        }
        return count;
    }

    public static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getName() {
            return name;
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
    }
}
