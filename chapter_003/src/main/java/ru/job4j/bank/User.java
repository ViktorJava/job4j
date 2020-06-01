package ru.job4j.bank;

import java.util.Objects;

/**
 * Модель клиента банка.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 24.05.2020
 */
public class User {
    private String passport;
    private String username;

    /**
     * Конструктор клиента банка.
     *
     * @param passport Номер паспорта клиента банка.
     * @param username Имя клиента банка.
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Возвращает номер паспорта.
     *
     * @return Номер паспорта.
     */

    public String getPassport() {
        return passport;
    }

    /**
     * Установить номер паспорта.
     *
     * @param passport Номер паспорта.
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Вернуть ФИО Клиента.
     *
     * @return ФИО клиента.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Установить ФИО клиента.
     *
     * @param username ФИО клиента.
     */
    public void setUsername(String username) {
        this.username = username;
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
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }

    @Override
    public String toString() {
        return "User{" + "passport='" + passport + '\''
                + ", username='" + username + '\''
                + '}';
    }
}
