package ru.job4j.strategy;

import java.util.StringJoiner;

/**
 * Реализация стратеги Shape.
 * Метод построения пямоугольника
 * используя StringJoiner (Java SE 8).
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10.12.2019
 */
public class Square implements Shape {
    @Override
    public String draw() {
        int count = 4;
        StringJoiner pic = new StringJoiner("");
        for (int i = 0; i < count; i++) {
            // Внутренний цикл для печати одной строки
            for (int j = 0; j < count; j++) {
                // Super-mega-turbo cложное условие, твою мать
                if (j == 0 || j == count - 1 || i == 0 || i == count - 1) {
                    pic.add("*");
                } else {
                    pic.add(" ");
                }
            }
            // Переход на следующую строку
            pic.add(System.lineSeparator());
        }
        return pic.toString();
    }
}