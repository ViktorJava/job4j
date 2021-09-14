package ru.job4j.loop;

/**
 * Найти сумму каждого второго числа в заданном диапазоне.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/13/2021
 */
public class SecondSum {

    /**
     * Метод суммирует каждое второе число в диапазоне [a, b] начиная с первого.
     *
     * @param a Число начала диапазона.
     * @param b Число конца диапазона.
     * @return Сумма каждого второго числа на заданном диапазоне.
     */
    public static int sum(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i += 2) {
            result = result + i;
        }
        return result;
    }
}
