package ru.job4j.collection;

import java.util.ArrayList;

/**
 * Создайте класс UsageArrayList.
 * В нем создайте метод main.
 * В методе main создайте объект ArrayList с типом String.
 * Добавьте в него 3 имени: Petr, Ivan, Stepan.
 * Далее через цикл for-each выведите все элементы на консоль.
 * #173443
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 12.05.2020
 */
public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<String>();
        people.add("Petr");
        people.add("Ivan");
        people.add("Stepan");

        for (Object value : people) {
            System.out.println(value);
        }
    }
}
