package ru.job4j.lambda.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

/**
 * Вставка элементов в карту с использованием BiConsumer.
 * Проверка условий через BiPredicate.
 * Создание ArrayList и его заполнение, через Supplier.
 * Преобразование строк к строкам в верхнем регистре с помощью Function.
 * Вывод строк на консоль с применением Consumer.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/15/2021
 */
public class FunctionalInterfaces {
    @SuppressWarnings("Convert2MethodRef")
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = (k, v) -> map.put(k, v);
        biCon.accept(1, "one");
        biCon.accept(1, "one");
        biCon.accept(2, "two");
        biCon.accept(3, "three");
        biCon.accept(4, "four");
        biCon.accept(5, "five");
        biCon.accept(6, "six");
        biCon.accept(7, "seven");

        BiPredicate<Integer, String> biPred = (i, s) ->
                i % 2 == 0 || s.length() == 4;

        for (Integer i: map.keySet()) {
            if (biPred.test(i, map.get(i))) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }

        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());
        Consumer<String> con = s -> System.out.printf("%s ", s);
        Function<String, String> func = (s) -> s.toUpperCase();
        for (String s: sup.get()) {
            con.accept(func.apply(s));
        }
    }
}
