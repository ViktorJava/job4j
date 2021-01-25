package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <h2>[#173324] Список адресов.</h2>
 * В туристической компании появилась задача
 * составить список адресов клиентов.
 * В анкете у клиента, есть адрес проживания.
 *
 * <li>Создать класс {@link Profiles} и метод
 * {@code List<Address> collect(List<Profile> profiles)};
 * <li>При решении задания нужно использовать {@code Stream API}, метод {@code map},
 * метод {@code collect(Collectors.toList())};
 * <li>Метод {@code Stream.map} - принимает элемент потока и возвращает другой элемент.
 * <li>Список элементов должен быть уникальным.
 * Порядок элементов отсортирован по полю {@code String city}.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.2
 * @since 18.10.2020
 */
public class Profiles {

    /**
     * Метод возвращает список адресов клиентов (без сортировки с дубликатами).
     *
     * @param profiles Анкета клиента.
     * @return Список адресов.
     */
    public static List<Adress> collect(List<Profile> profiles) {
        return profiles.stream()
                       .map(Profile::getAdress)
                       .collect(Collectors.toList());
    }

    /**
     * Метод возвращающий список с уникальными адресами проживания
     * (без дубликатов по городу проживания)
     *
     * @param profiles Анкета клиента.
     * @return Уникальный список адресов.
     */
    public static List<Adress> uniquAdressList(List<Profile> profiles) {
        return profiles.stream()
                       .map(Profile::getAdress)
                       .sorted(Comparator.comparing(Adress::getCity))
                       .distinct()
                       .collect(Collectors.toList());
    }
}
