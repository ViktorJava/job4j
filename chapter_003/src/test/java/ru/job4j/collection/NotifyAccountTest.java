package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Модели данных и HashSet. [#218530]
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/30/2021
 */
public class NotifyAccountTest {
    @Test
    public void sent() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void sentDuplicates() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("182", "Petr Arsentev", "89792"),
                new Account("123", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("182", "Petr Arsentev", "89792")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}
