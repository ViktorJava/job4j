package ru.job4j.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Итератор для Set.
 * Необходимо, заполнить коллекцию строками от one до five.
 * Потом, написать код так, чтобы в цикле печатались строки пока они есть,
 * при этом на каждой итерации выводилось сообщение,
 * что значение существует в наборе.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 27.11.2020
 */
public class SetIterator {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>(Set.of("one", "two", "three", "four", "five"));
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.printf("Next element exist? - %s.%n", true);
            System.out.println(iterator.next());
        }
    }
}
