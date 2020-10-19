package ru.job4j.stream;

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
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 18.10.2020
 */
public class Profiles {

    public static List<Adress> collect(List<Profile> profiles) {
        return profiles.stream().map(Profile::getAdress).collect(Collectors.toList());
    }
}
