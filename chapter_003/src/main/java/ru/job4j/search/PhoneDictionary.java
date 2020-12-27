package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * <h2>Телефонный справочник на базе ArrayList.</h2>
 * Поиск ключа в списке реализован на лямбде и
 * функциональном интерфейсе.<p>
 * Модель справочника.<p>
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.4
 * @since 12.05.2020
 */
public class PhoneDictionary {
    private final ArrayList<Person> persons = new ArrayList<>();

    /**
     * Добавить персону в справочник.
     *
     * @param person Person. Персона добавляемая в справочник.
     */
    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, которые содержат key в любых полях.
     *
     * @param key String. Ключ поиска.
     * @return Person. Список пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> combine = t -> t.getName().contains(key);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine
                    .or(t -> t.getAddres().contains(key))
                    .or(t -> t.getPhone().contains(key))
                    .or(t -> t.getSurname().contains(key))
                    .test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
