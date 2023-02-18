package ru.job4j.stream.exercises;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * Понятие редукции. Произвольный Collector для подсчета.
 * Нам нужен коллектор, который помножит все числа в Stream по порядку.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10/12/2021
 */
public class CollectorAriphmetic {
    /**
     * Метод получает список чисел, из потока в коллекторе числа умножаются
     * по порядку и возвращается результат.
     *
     * @param list Список чисел.
     * @return Результат умножения чисел из списка, по порядку.
     */
    public static Integer collect(List<Integer> list) {
        Supplier<List<Integer>> supplier = LinkedList::new;
        BiConsumer<List<Integer>, Integer> consumer = List::add;
        BinaryOperator<List<Integer>> merger = (xs, ys) -> {
            xs.addAll(ys);
            return xs;
        };
        Function<List<Integer>, Integer> function = (ns) -> {
            int number = 1;
            for (Integer n : ns) {
                number *= n;
            }
            return number;

        };
        return list.stream()
                .collect(Collector.of(supplier, consumer, merger, function));
    }
}
