package ru.job4j.modern;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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
            if (Color.GREEN.equals(apple.getColor())) {
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

    /**
     * Метод отбирает blue яблоки. Сигнатура метода соответствует
     * функциональному интерфейсу Predicate.
     *
     * @param apple Объект типа Apple
     * @return true в случае цвета яблока blue.
     */
    public static boolean isBlueApple(Apple apple) {
        return Color.BLUE.equals(apple.getColor());
    }

    /**
     * Метод отбирает яблоки, весом более 100. Сигнатура метода соответствует
     * функциональному интерфейсу Predicate.
     *
     * @param apple Объект типа Apple
     * @return true в случае веса яблока более 100 грамм.
     */
    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 100;
    }

    /**
     * Фильтр отбирает яблоки согласно правилам полученным через аргумент, в
     * виде функционального интерфейса Predicate.
     *
     * @param inventory Список яблок.
     * @param p         Условия фильтрации списка яблок.
     * @return Отфильтрованный список яблок, согласно полученным правилам.
     */
    static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
