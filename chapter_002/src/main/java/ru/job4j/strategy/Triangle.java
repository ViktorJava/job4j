package ru.job4j.strategy;

import java.util.StringJoiner;

/**
 * Реализация стратеги Shape.
 * Метод построения треугольника
 * используя StringJoiner (Java SE 8).
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10.12.2019
 */
public class Triangle implements Shape {
    @Override
    public String draw() {
        int count = 4;
        StringJoiner pic = new StringJoiner("");
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i || i == count - 1) {
                    pic.add("*");
                } else {
                    pic.add(" ");
                }
            }
            pic.add(System.lineSeparator());
        }
        return pic.toString();
    }
}
