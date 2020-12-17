package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Промежуточные операции. Метод filter(). Фильтрация объектов.
 * <p>
 * Нужно оставить только пользователей, у которых имя начинается с буквы "B",
 * а возраст > 18.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 17.12.2020
 */
public class FilterObject {
    /**
     * Модель данных User.
     */
    public static class User {
        private final String name;
        private final int age;

        public User(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    /**
     * Метод фильтрации объектов.
     *
     * @param users Список объектов типа User.
     * @return Отфильтрованный список объектов типа User.
     */
    public static List<User> filter(List<User> users) {
        return users.stream()
                    .filter(s -> s.getName()
                                  .startsWith("B"))
                    .filter(age -> age.getAge() > 18)
                    .collect(Collectors.toList());
    }
}
