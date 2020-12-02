package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Получить значения отображения по ключу.
 * Нужно, чтобы в консоль были выведены все значения отображения.
 * При этом необходимо использовать метод keySet() и get().
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 02.12.2020
 */
public class KeySet {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(
                Map.of(
                        1, "root@root",
                        2, "local@local",
                        3, "host@host")
        );
        Set<Integer> keys = map.keySet();
        for (int index : keys) {
            map.get(index);
            System.out.println(index + " - " + map.get(index));
        }
    }
}
