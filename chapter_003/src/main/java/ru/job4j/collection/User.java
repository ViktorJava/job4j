package ru.job4j.collection;

import java.util.Objects;

/**
 * Сортировка для модели ru.job4j.collection.User.
 * В модели должны быть поля: имя и возраст.
 * Предусмотреть ситуацию, если два пользователя имеют одинаковое имя,
 * то нужно проверить сравнить тогда их возраст.
 * <p>
 * Класс User должен реализовать интерфейс Comparable.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 19.05.2020
 */
public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(User o) {
        int result = Integer.compare(this.age, o.age);
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        return result;
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
        return age == user.age
                && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
