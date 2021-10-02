package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Паспорт и жители [#212656]
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10/2/2021
 */
public class PassportOffice {
    private final Map<String, Citizen> citizens = new HashMap<>();

    /**
     * Метод проверяет, что гражданина с таким паспортом еще нет в хранилище.
     *
     * @param citizen Объект типа Citizen.
     * @return true, если пользователя еще нет в HashMap.
     * Если он уже есть, то вернуть false.
     */
    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    /**
     * Метод получает информацию о гражданине по его паспорту.
     *
     * @param passport Номер паспорта.
     * @return Гражданин по номеру паспорта или null в случае отсутствия
     * такого гражданина.
     */
    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}
