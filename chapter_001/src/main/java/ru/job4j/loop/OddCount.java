package ru.job4j.loop;

/**
 * Найти количество нечетных в диапазоне.
 * Даны два целых положительных числа a и b (b > a).
 * Найти количество нечетных чисел в диапазоне [a, b].
 * Нечетным считается число, у которого остаток от деления на 2 равен 1.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 23.11.2020
 */
public class OddCount {
    /**
     * Метод поиска всех нечетных чисел в диапазоне.
     *
     * @param a Начало диапазона.
     * @param b Конец диапазона.
     * @return Кол-во нечётных чисел в диапазоне.
     */
    public static int count(int a, int b) {
        int res = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                res++;
            }
        }
        return res;
    }
}
