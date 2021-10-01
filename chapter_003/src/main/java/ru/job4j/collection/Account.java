package ru.job4j.collection;

import java.util.Objects;

/**
 * Модель данных - клиент банка.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/30/2021
 */
public class Account {
    private final String passport;
    private final String account;
    private final String deposit;

    public Account(String passport, String account, String deposit) {
        this.passport = passport;
        this.account = account;
        this.deposit = deposit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(passport, account.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }

    @Override
    public String toString() {
        return "Account{"
                + "passport='" + passport + '\''
                + ", account='" + account + '\''
                + ", deposit='" + deposit + '\''
                + '}';
    }
}
