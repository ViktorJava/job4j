package ru.job4j.stream.exercises;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Группировка элементов. Группировка пользователей по возрасту.
 * <p>
 * Сгруппировать пользователей по возрасту.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 19.12.2020
 */
public class GroupMethod {
    /**
     * Модель пользователя.
     */
    public static class User {
        private final int age;
        private final String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
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
            return Objects.hash(age, name);
        }
    }

    /**
     * Метод группирования пользователей по возрасту.
     *
     * @param data Список пользователей.
     * @return Карта с группами пользователей, где key- возраст, value- User.
     */
    public static Map<Integer, List<User>> groupBy(List<User> data) {
        return data.stream()
                   .collect(Collectors.groupingBy(age -> age.getAge()));
    }
}
