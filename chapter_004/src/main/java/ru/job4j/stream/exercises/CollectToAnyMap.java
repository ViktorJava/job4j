package ru.job4j.stream.exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Сборка элементов. Сборка в произвольную реализацию Map.
 * <p>
 * Собрать Map из стрима чисел, где ключ это само число, а значение его квадрат.
 * Сборка должна быть в LinkedHashMap. Обработка коллизий с ключами.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 21.12.2020
 */
public class CollectToAnyMap {
    /**
     * Метод сборки мапы из стрима чисел.
     *
     * @param data Поток данных типа Integer.
     * @return LinkedHashMap с данными полученными в результате преобразования.
     */
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toMap(
                (k) -> k, (v) -> v * v,
                (prev, next) -> prev,
                (LinkedHashMap::new))
        );
    }
}
