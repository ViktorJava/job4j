package ru.job4j.comparator;

import java.util.Comparator;
import java.util.Objects;

/**
 * Получение компаратора. Метод thenComparing.
 * <p>
 * Иногда бывает так , что необходимо задать приоритет порядка следования
 * элементов. Например, сначала нам нужно отсортировать элементы по одному
 * признаку, но если признаки равны, то сортировать по другому признаку.
 * Для этой задачи существует метод thenComparing().
 * Компаратор учитывает оба компаратора, используя сначала первый, а потом второй.
 * <p>
 * Написал компаратор, который будет упорядочивать пользователей типа User
 * сначала по возрастанию по имени, а потом по убыванию по возрасту.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/29/2021
 */
public class ThenComparingMethod {
    /**
     * Метод объединяет два компаратора для упорядочивания сначала
     * по возрастанию по имени, а потом по убыванию по возрасту.
     *
     * @return Компаратор типа User.
     */
    public static Comparator<User> thenComparing() {
        return ascByName().thenComparing(descByAge());
    }

    /**
     * Метод упорядочивает по имени по возрастанию.
     *
     * @return Компаратор типа User.
     */
    public static Comparator<User> ascByName() {
        return Comparator.comparing(User::getName);

    }

    /**
     * Метод упорядочивает по возрасту по убыванию.
     *
     * @return Компаратор типа User.
     */
    public static Comparator<User> descByAge() {
        return Comparator.comparingInt(User::getAge).reversed();
    }

    /**
     * Static Nested Class.
     */
    public static class User {
        private final String name;
        private final int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
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
            return age == user.age && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
        }
    }
}
