package ru.job4j.map;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Объединение значений в Map.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 30.10.2021
 */
public final class Merge {
    private Merge() {
    }

    /**
     * Метод принимает отображение: - id пользователя - имя пользователя,
     * а также список пользователей.
     * Возникла проблема - данные в отображении хранились так долго
     * и ранее не было предусмотрено, что помимо имени необходимо хранить
     * еще и фамилию.
     * Необходимо обновить информацию - если такой пользователь уже существует
     * (проверять по ключу) - то необходимо к имени добавить фамилию,
     * если нет - то сначала добавить пользователя - ключ id,
     * значение - имя пользователя, а потом только обновить и добавить фамилию.
     *
     * @param names ОтображениеЖ id и name пользователя.
     * @param users Список пользователей.
     * @return Результирующее отображение с объединёнными значениями.
     */
    public static Map<Integer, String> collectData(
            final Map<Integer, String> names, final List<User> users) {

        for (User u: users) {
            names.putIfAbsent(u.getId(), u.getName());
            int i = u.getId();
            String s = u.getSurname();
            names.merge(u.getId(), u.getSurname(), (oldV, newV) -> oldV
                    + " " + newV);
        }
        return names;
    }

    /**
     * Модель данных.
     */
    public static class User {
        /**
         * Уникальный идентификатор пользователя.
         */
        private final int id;
        /**
         * Имя.
         */
        private final String name;
        /**
         * Фамилия.
         */
        private final String surname;

        /**
         * Конструктор.
         *
         * @param id      Идентификатор пользователя.
         * @param name    Имя пользователя.
         * @param surname Фамилия пользователя.
         */

        public User(final int id, final String name, final String surname) {
            this.id = id;
            this.name = name;
            this.surname = surname;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
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
            return id == user.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
}
