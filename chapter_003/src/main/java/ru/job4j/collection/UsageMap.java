package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Map, HashMap [#212652]
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10/1/2021
 */
public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> card = new HashMap<>();
        card.put("gipsyscrew@yandex.ru", "Vdovichenko V.A.");
        for (String key: card.keySet()) {
            String value = card.get(key);
            System.out.println(key + " - " + value);
        }
    }
}
