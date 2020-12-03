package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Изменение уже существующей записи в отображении.
 * Задание: метод принимает два отображения, которые имеют одинаковый размер:
 * 1. Ключ - тип Integer, значение - тип String. При этом значение - это Имя,
 * ключ - возрастающая последовательность, начиная с 1.
 * 2. Ключ - тип Integer, значение - тип String. При этом значение -
 * это Фамилия, ключ - возрастающая последовательность, начиная с 1.
 * <p>
 * Необходимо пройтись по первому отображению и к значению имени добавить
 * значение фамилии, чтобы на выходе получилось отображение - ключ(число) -
 * значение(строка - имя + фамилия).
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.2
 * @since 03.12.2020
 */
public class ComputeIfPresent {
    /**
     * Метод вносит изменения в уже существующие записи в отображении.
     *
     * @param name    Отображение с именами.
     * @param surname Отображение с фамилиями.
     * @return Отображение с объединёнными фамилией и именем.
     */
    public static Map<Integer, String> collectData(
            Map<Integer, String> name,
            Map<Integer, String> surname) {
        Map<Integer, String> map = new HashMap<>(name);
        for (int index : name.keySet()) {
            map.computeIfPresent(index, (key, value) -> value + " " + surname.get(index));
        }
        return map;
    }
}
