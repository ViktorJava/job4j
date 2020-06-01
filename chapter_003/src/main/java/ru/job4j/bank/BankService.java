package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Главный сервис.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 24.05.2020
 */
public class BankService {
    //Это поле содержит всех пользователей системы с привязанными к ним счетами.
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Это метод должен добавить пользователя в систему.
     * По умолчанию добавляем пустой список банковских счетов.
     *
     * @param user Клиент банка.
     */
    public void addUser(User user) {
        this.users.putIfAbsent(user, new ArrayList<Account>());
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
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> currentAccount = users.get(user);
            boolean b = currentAccount.contains(account);
            if (!b) {
                currentAccount.add(account);
            }
        }
    }

    /**
     * Это метод ищет пользователя по номеру паспорта.
     * Здесь нужно использовать перебор всех элементов
     * через цикл for-earch и метод Map.keySet.
     *
     * @param passport Номер паспорта.
     * @return Клиент банка которому соответствует паспорт.
     */
    public User findByPassport(String passport) {
        User user = null;
        for (User currentUser : users.keySet()) {
            if (currentUser != null) {
                if (currentUser.getPassport().equals(passport)) {
                    user = currentUser;
                    break;
                }
            }
        }
        return user;
    }

    /**
     * Этот метод ищет счет пользователя по реквизитам.
     * Сначала нужно найти пользователя.
     * Потом получить список счетов этого пользователя
     * и в нем найти нужный счет.
     * Можно найти нужный нам счёт методом брут-форс,
     * перебирая в цикле все счета клиента и
     * через equals сверять реквизиты.
     *
     * @param passport  Номер паспорта.
     * @param requisite Номер счёта.
     * @return Аккаунт клиента.
     */
    public Account findByRequisite(String passport, String requisite) {
        Account find = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> currentAccounts = users.get(user);
            int index = currentAccounts.indexOf(new Account(requisite, -1));
            find = currentAccounts.get(index);
        }
        return find;
    }

    /**
     * Метод для перечисления денег с одного счёта на другой счёт.
     *
     * @param srcPassport   Номер паспорта отправителя.
     * @param srcRequisite  Номер счёта отправителя.
     * @param destPassport  Номер паспорта получателя.
     * @param destRequisite Номер счёта получателя.
     * @param amount        Колличество денег.
     * @return true- при удачной операции, иначе false.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (src != null && dest != null) {
            if (src.getBalance() >= amount) {
                dest.setBalance(dest.getBalance() + amount);
                src.setBalance(src.getBalance() - amount);
                rsl = true;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>(); // список аккаунтов
        String requisite = "3fdsbb9"; // счет
        accounts.add(new Account("3fdsbb9", 140)); // добавляем аккаунт с номером счёта и балансом
        accounts.add(new Account("3grgb9", 100)); // добавляем аккаунт с номером счёта и балансом
        //в списке аккаунтов ищем номер счёта и получаем индекс в списке.
        int index = accounts.indexOf(new Account(requisite, -1));
        Account find = accounts.get(index);
        System.out.println(find.getRequisite() + " -> " + find.getBalance());
    }
}
