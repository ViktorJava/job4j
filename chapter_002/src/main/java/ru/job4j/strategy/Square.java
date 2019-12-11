package ru.job4j.strategy;

/**
 * Реализация стратеги Shape
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10.12.2019
 */
public class Square implements Shape {
    @Override
    public String draw() {
        int count = 4;
        StringBuilder pic = new StringBuilder();
        for (int i = 0; i < count; i++) {
            // Внутренний цикл для печати одной строки
            for (int j = 0; j < count; j++) {
                // Super-mega-turbo cложное условие, твою мать
                if (j == 0 || j == count - 1 || i == 0 || i == count - 1) {
                    pic.append("*");
                } else {
                    pic.append(" ");
                }
            }
            // Переход на следующую строку
            pic.append(System.lineSeparator());
        }
        return pic.toString();
    }
}