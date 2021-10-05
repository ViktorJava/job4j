package ru.job4j.bank;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertFalse;

/**
 * Тесты банковской системы.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.2
 * @since 24.05.2020
 */
public class BankServiceTest {
    /**
     * Добавление клиента.
     */
    @Test
    public void addUser() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassportStream("3434").get(), is(user));
    }

    /**
     * Когда номер паспорта не найден.
     */
    @Test
    public void whenEnterInvalidPassport() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertFalse(bank.findByRequisiteStream("34", "5546").isPresent());
    }

    /**
     * Добавление счёта.
     */
    @Test
    public void addAccount() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertThat(bank.findByRequisiteStream("3434", "5546")
                       .get()
                       .getBalance(), is(150D));
    }

    /**
     * Перевод средств по счетам.
     */
    @Test
    public void transferMoney() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 150D);
        assertThat(bank.findByRequisiteStream(user.getPassport(), "113")
                       .get()
                       .getBalance(), is(200D));
    }
}
