package ru.job4j.bank;

import java.util.*;
import java.util.stream.Stream;

/**
 * Главный сервис.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.4
 * @since 24.05.2020
 */
public class BankService {
    /**
     * Это поле содержит всех пользователей системы с привязанными к ним счетами.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Это метод должен добавить пользователя в систему.
     * По умолчанию добавляем пустой список банковских счетов.
     *
     * @param user Клиент банка.
     */
    public void addUser(User user) {
        this.users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Должен добавить новый счет к пользователю.
     * Первоначально, пользователя нужно найти по паспорту.
     * Для этого нужно использовать метод findByPassport.
     * После этого мы получим список всех счетов пользователя и
     * добавим новый счет к ним. В этом методе должна быть проверка,
     * что такого счета у пользователя еще нет.
     *
     * @param passport Номер паспорта клиента.
     * @param account  Аккаунт клиента.
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> currentAccount = users.get(user.get());
            boolean b = currentAccount.contains(account);
            if (!b) {
                currentAccount.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта.
     *
     * @param passport Номер паспорта.
     * @return Клиент банка, которому соответствует паспорт.
     */
    public Optional<User> findByPassport(String passport) {
        Stream<User> userStream = users.keySet().stream();
        return userStream
                .filter(u -> u.getPassport().equals(passport))
                .findFirst();
    }


    /**
     * Метод ищет счет пользователя по реквизитам.
     * Сначала нужно найти пользователя.
     * Потом получить список счетов этого пользователя и в нем найти нужный счет.
     *
     * @param passport  Номер паспорта.
     * @param requisite Номер счёта.
     * @return Аккаунт клиента или null Optional в случае отсутствия.
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<Account> result = Optional.empty();
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            result = users.get(user.get()).stream()
                          .filter(account -> account.getRequisite()
                                                    .equals(requisite))
                          .findFirst();
        }
        return result;
    }

    /**
     * Метод для перечисления денег с одного счёта на другой счёт.
     *
     * @param srcPassport   Номер паспорта отправителя.
     * @param srcRequisite  Номер счёта отправителя.
     * @param destPassport  Номер паспорта получателя.
     * @param destRequisite Номер счёта получателя.
     * @param amount        Количество денег.
     * @return true- при удачной операции, иначе false.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean result = false;
        Optional<Account> src = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> dest = findByRequisite(destPassport, destRequisite);
        if (src.isPresent() && dest.isPresent()
                && src.get().getBalance() >= amount) {
            dest.get().setBalance(dest.get().getBalance() + amount);
            src.get().setBalance(src.get().getBalance() - amount);
            result = true;
        }
        return result;
    }
}
