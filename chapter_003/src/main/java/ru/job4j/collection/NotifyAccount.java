package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * Модели данных и HashSet. [#218530]
 * <p>
 * В банковской системе, есть рассылка. Наш клиент подписался на разные рассылки.
 * Может быть такая ситуация, что клиент должен получить сразу несколько писем.
 * Чтобы система не спамила нашего клиента, там нужно оставить только уникальных
 * клиентов для отправки. То есть если клиент должен получить уведомление
 * по разным подпискам, мы будем упаковывать их в одно письмо.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/30/2021
 */
public class NotifyAccount {
    /**
     * Метод преобразованию List в Set.
     * HashSet устранит дубликаты клиентов банка самостоятельно опираясь на
     * серию паспорта клиента.
     *
     * @param accounts Список клиентов банка.
     * @return Список уникальных клиентов банка.
     */
    @SuppressWarnings("UseBulkOperation")
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        for (Account account: accounts) {
            rsl.add(account);
        }
        return rsl;
    }
}
