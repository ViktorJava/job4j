package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Создание списка.
 * Необходимо создать список на 10 элементов, добавить в него строки
 * от one до three, дальше создать второй список в который в виде коллекции
 * добавить первый список. После этого в цикле forEach вывести все элементы
 * второго списка.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 21.11.2020
 */
public class CreatorNewList {
    public static void main(String[] args) {
        System.out.println("Создаем список с пустым конструктором.");
        List<String> first = new ArrayList<>();
        System.out.println("Добавляем 3 элемента в список.");
        first.add("one");
        first.add("two");
        first.add("three");
        System.out.println("Создаем список - в конструктор передаем коллекцию.");
        List<String> second = new ArrayList<>(first);
        System.out.println("Выводим все элементы в списке.");
        for (String el : second) {
            System.out.println(el);
        }
    }
}
