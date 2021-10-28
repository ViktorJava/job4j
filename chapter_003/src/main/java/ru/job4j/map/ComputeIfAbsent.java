package ru.job4j.map;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Вычисление значений в отображении если ключа не существует.
 * Утилитный финальный класс, с переопределённым, приватным default конструктором
 * и статическим методом и static nested class.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10/25/2021
 */
public final class ComputeIfAbsent {
    /**
     * Переопределённый дэфолтный, закрытый конструктор.
     */
    private ComputeIfAbsent() {
    }

    /**
     * Метод принимает отображение в котором содержатся пары:
     * ключ(число) - значение(строка), при этом строка - это имя пользователя
     * (в отображении они представлены пустой строкой),
     * ключ - его id. Также в качестве аргумента метод принимает
     * список пользователей.
     * <p>
     * Метод  производит ассоциацию id и name пользователя в отображении.
     * При этом:
     * 1. Если такой ключ уже есть в отображении - метод обновляет ассоциацию.
     * 2. Если такого ключа нет - метод добавляет ассоциацию.
     * см.: unit tests.
     *
     * @param names Отображение в котором ключ- это число, а значение- строка.
     * @param users Список объектов типа User.
     * @return Ассоциация id и name объекта типа User с отображением names.
     */
    public static Map<Integer, String> collectData(
            final Map<Integer, String> names, final List<User> users) {
        for (User u: users) {
            names.computeIfPresent(u.getId(), (k, v) -> u.getName());
            names.computeIfAbsent(u.getId(), k -> u.getName());
        }
        return names;
    }

    /**
     * Модель класса.
     * Static nested class.
     */
    public static class User {
        private final int id;
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

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            ComputeIfAbsent.User user = (ComputeIfAbsent.User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public final int hashCode() {
            return Objects.hash(name);
        }
    }
}
