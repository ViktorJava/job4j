package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Телефонный справочник на базе ArrayList.
 * Поиск ключа в списке реализован на лямбде и
 * функциональном интерфейсе.
 * Модель справочника.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.2
 * @since 2.10.2020
 */
public class PhoneDictionary {
    private final ArrayList<Person> persons = new ArrayList<>();

    /**
     * Добавить персону в справочник.
     *
     * @param person персона добавляемая в справочник.
     */
    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, которые содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подошедших пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> combine = t -> t.getName().contains(key)
                || t.getAddres().contains(key)
                || t.getPhone().contains(key)
                || t.getSurname().contains(key);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
