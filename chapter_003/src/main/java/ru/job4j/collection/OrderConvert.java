package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

/**
 * Конвертер списка заказа в карту.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 15.05.2020
 */
public class OrderConvert {
    /**
     * Преобразование списка заказа в карту.
     *
     * @param orders список заказа.
     * @return карта.
     */
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order order : orders) {
            map.put(order.getNumber(), order);
        }
        return map;
    }
}
