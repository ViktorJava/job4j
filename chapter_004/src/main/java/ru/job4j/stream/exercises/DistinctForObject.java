package ru.job4j.stream.exercises;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Промежуточные операции. Метод distinct(). Уникальные объекты.
 * <p>
 * Получить список уникальных пользователей.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 25.12.2020
 */
public class DistinctForObject {
    public static class User {
        private final String name;
        private final int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
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
            return age == user.age && name.equals(user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "User{"
                    + "name='" + name
                    + '\''
                    + ", age=" + age
                    + '}';
        }
    }

    /**
     * Метод получения списка уникальных элементов типа User.
     *
     * @param users User список элементов.
     * @return User список уникальных элементов.
     */
    public static List<User> distinct(List<User> users) {
        return users.stream()
                    .distinct()
                    .collect(Collectors.toList());
    }
}
