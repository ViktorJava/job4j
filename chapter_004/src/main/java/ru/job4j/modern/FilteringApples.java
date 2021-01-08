package ru.job4j.modern;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс фильтрации яблок.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 08.01.2021
 */
public class FilteringApples {
    /**
     * Метод фильтрует зелёные яблоки.
     *
     * @param inventory Список яблок.
     * @return Список зелёных яблок.
     */
    public static List<Apple> filteringGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * Метод фильтрует яблоки по весу. Отбираются яблоки весом более 10 грамм.
     *
     * @param inventory Список яблок.
     * @return Список яблок тяжелее 10 грамм.
     */
    public static List<Apple> filteringWeightApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > 10) {
                result.add(apple);
            }
        }
        return result;
    }
}
