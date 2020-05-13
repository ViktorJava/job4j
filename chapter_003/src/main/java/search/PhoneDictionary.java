package search;

import java.util.ArrayList;

/**
 * Телефонный справочник на базе ArrayList.
 * Поиск данных в списе.
 * Модель справочника.
 * [#173439]
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 12.05.2020
 */
public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    /**
     * Добавить персону в справочник.
     *
     * @param person персона добавляемя в справочник.
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
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().contains(key)
                    || person.getSurname().contains(key)
                    || person.getPhone().contains(key)
                    || person.getAddres().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }
}
