package ru.job4j.bank;

import java.util.Objects;

/**
 * Модель банковского счёта.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 24.05.2020
 */
public class Account {
    private String requisite;
    private double balance;

    /**
     * Конструктор банковского счёта.
     *
     * @param requisite Номер счёта.
     * @param balance   Состояние счёта.
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Гетер номера счёта.
     *
     * @return Номер счёта.
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Сетер номера счёта.
     *
     * @param requisite Номер счёта.
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Состояние счёта.
     *
     * @return Баланс счёта.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Сетер состояния.
     *
     * @param balance Бабло положить на счёт.
     */
    public void setBalance(double balance) {
        this.balance = balance;
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
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
