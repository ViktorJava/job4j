package ru.job4j.list;

import java.util.List;

/**
 * Заполнение списка фабричным методом.
 * <p>
 * В методе нужно заполнить коллекцию значениями от first до fifth.
 * С помощь фабричного метода of().
 * После этого с помощью цикла for() с индексами
 * и метода get() вывести все элементы.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 19.11.2020
 */
public class Factory {
    public static void main(String[] args) {
        List<String> list = List.of("first", "second", "third", "fourth", "fifth");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
