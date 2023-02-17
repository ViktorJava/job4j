package ru.job4j.stream.tutors;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static ru.job4j.stream.tutors.Dish.Type.*;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 19.01.2021
 */
public class Main {
    public static void main(String[] args) {
        List<Dish> menu = List.of(
                new Dish("pork", false, 800, MEAT),
                new Dish("beef", false, 700, MEAT),
                new Dish("salmon", false, 450, FISH),
                new Dish("pizza", true, 550, OTHER)
        );
        List<String> threeHigCaloricDishName = menu
                .stream()
                .map(Dish::getName)
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .sorted()
                .distinct()
                .collect(toList());
        System.out.println(threeHigCaloricDishName);
    }
}
