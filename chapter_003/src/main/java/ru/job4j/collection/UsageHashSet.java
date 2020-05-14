package ru.job4j.collection;

import java.util.HashSet;

/**
 * Создал коллекцию autos и добавил в неё марки машин.
 * Добавил цикл for-each и вывел элементы коллекции HashSet на консоль.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 14.05.2020
 */
public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<String>();
        autos.add("Lada");
        autos.add("BMW");
        autos.add("Volvo");
        autos.add("Toyota");
        for (String auto : autos) {
            System.out.println(auto);
        }
    }
}
