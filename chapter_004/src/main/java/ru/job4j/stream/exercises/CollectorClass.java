package ru.job4j.stream.exercises;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * Понятие редукции. Произвольный Collector для сборки в коллекцию.
 * Задача: прописать создание коллекции и добавление элемента.
 * Коллекцией будет LinkedList, для добавление нужно использовать метод add()
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10/12/2021
 */
public class CollectorClass {
    /**
     * Создание коллекции и добавление элементов.
     *
     * @param list Список чисел.
     * @return LinkedList коллекция с числами полученными на входе.
     */
    public static List<Integer> collect(List<Integer> list) {
        //в созданной коллекции будет храниться наш результат.
        Supplier<List<Integer>> supplier = LinkedList::new;
        //как мы будем собирать элементы в коллекцию.
        BiConsumer<List<Integer>, Integer> biConsumer = List::add;
        //используем для совмещения результатов параллельных вычислений.
        BinaryOperator<List<Integer>> operator = (left, right) -> {
            left.addAll(right);
            return left;
        };
        return list
                .stream()
                .collect(Collector.of(supplier, biConsumer, operator));
    }
}
