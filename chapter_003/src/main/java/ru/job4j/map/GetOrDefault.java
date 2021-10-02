package ru.job4j.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Возврат отличных от null значений по умолчанию.
 * <p>
 * Необходимо реализовать метод, который позволит добавить элемент
 * list(значение) с ключом index в хранилище store только в том случае,
 * если такого ключа пока еще нет в хранилище. Метод getValue() должен вернуть
 * значение, которое соответствует ключу index, если такого ключа нет -
 * необходимо вернуть пустой список.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 02.12.2020
 */
public class GetOrDefault {
    private final Map<Integer, List<String>> store = new HashMap<>();

    /**
     * Метод добавляющий элемент в store, если такого ключа пока ещё нет
     * в хранилище.
     *
     * @param index Индекс добавляемого элемента в хранилище.
     * @param list  Добавляемый элемент в store.
     */
    public void addValue(int index, List<String> list) {
        if (!store.containsKey(index)) {
            store.put(index, list);
        }
    }

    /**
     * Метод возвращает значение, которое соответствует ключу.
     *
     * @param index Индекс ключа.
     * @return Значение которое соответствует ключу.
     */
    public List<String> getValue(int index) {
        return store.getOrDefault(index, List.of());
    }
}
