package ru.job4j.set;

import org.junit.Test;

import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Тесты фаервола.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 29.12.2020
 */
public class FirewallTest {
    @Test
    public void checkName() {
        Set<String> words = Set.of("instagram", "фото", "мем", "котик");
        String s = "Создание многомодульного Gradle проекта SpringBoot + Angular в IDEA";
        String result = Firewall.checkName(s, words);
        assertThat(result, is("Вы сделали правильный выбор!"));
    }

    @Test
    public void checkNameFalse() {
        Set<String> words = Set.of("instagram", "фото", "мем", "котик");
        String s = "Криштиану Роналду опубликовал новую фотографию с детьми в instagram";
        String result = Firewall.checkName(s, words);
        assertThat(result, is("Выберите другую статью..."));
    }
}
