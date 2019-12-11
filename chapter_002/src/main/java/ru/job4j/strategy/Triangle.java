package ru.job4j.strategy;

/**
 * Реализация стратеги Shape
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10.12.2019
 */
public class Triangle implements Shape {
    @Override
    public String draw() {
        int count = 4;
        StringBuilder pic = new StringBuilder();
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i + 1; j++) {
                //The super-puper if
                if (j == 0 || j == i || i == count - 1) {
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
//    построение заполненного треугольника
//        for (int i = 0; i < count; i++) {
//            for (int k = 0; k < i + 1; k++) {
//                pic.append("*");
//            }
//            pic.append(System.lineSeparator());
//        }
//        return pic.toString();
//    }
}