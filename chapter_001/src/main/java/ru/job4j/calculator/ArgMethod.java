package ru.job4j.calculator;

/**
 * Аргументы.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 27.06.2021
 */
public class ArgMethod {
    /**
     * Метод принимает на вход два аргумента, на основании которых формируется
     * строка и выводится на консоль.
     *
     * @param name Имя.
     * @param age  Возраст.
     */
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
    }
}
