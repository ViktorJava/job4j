package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * [#173324] Список адресов.
 * В туристической компании появилась задача
 * составить список адресов клиентов.
 * В анкете у клиента, есть адрес проживания.
 * <p>
 * 1. Создать класс Profiles и метод List<Address> collect(List<Profile> profiles);
 * 2. При решении задания нужно использовать Stream API, метод map,
 * метод collect(Collectors.toList());
 * 3. Метод Stream.map - принимает элемент потока и возвращает другой элемент.
 * 4. Список элементов должен быть уникальным.
 * Порядок элементов отсортирован по полю String city.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.2
 * @since 18.10.2020
 */
public class Profiles {

    /**
     * Метод возвращает список адресов клиентов
     * (без сортировки с дубликатами).
     *
     * @param profiles Анкета клиента.
     * @return Список адресов.
     */
    public static List<Adress> collect(List<Profile> profiles) {
        List<Adress> list = profiles.stream()
                .map(Profile::getAdress)
                .collect(Collectors.toList());
        return list;
    }

    /**
     * Метод возвращающий список с уникальными адресами
     * проживания (без дубликатов по городу проживания)
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
