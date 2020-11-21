package ru.job4j.list;

import java.util.Iterator;
import java.util.List;

/**
 * Итератор для списка.
 * Метод должен пройти по всему списку, вывести информацию, что следующий
 * элемент есть (в виде значения true), а также значение этого элемента.
 * Также после обхода списка необходимо вывести информацию, что
 * больше элементов нет (false).
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 21.11.2020
 */
public class IteratorForList {
    public static void main(String[] args) {
        List<String> list = List.of("one", "two", "three", "four", "five");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Next element has - " + true + ", this element is " + iterator.next());
        }
        System.out.println("Next element has - " + false);
    }
}
