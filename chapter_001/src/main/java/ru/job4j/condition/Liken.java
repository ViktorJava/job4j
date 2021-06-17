package ru.job4j.condition;

/**
 * Операции сравнения #47.
 * Написать класс ru.job4j.condition.Liken.
 * В переменную result запишите результат сравнения переменных first и second.
 * сравнить, что first больше second.
 * сравнить, что first меньше second.
 * сравнить, что first равна second.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 17.06.2021
 */
public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 9;
        boolean result = first > second;
        System.out.println(result);

        result = first < second;
        System.out.println(result);

        result = first == second;
        System.out.println(result);
    }
}
