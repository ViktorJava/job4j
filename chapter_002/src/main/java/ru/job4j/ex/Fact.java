package ru.job4j.ex;

/**
 * Класс вычисления факториала.
 * Кидаем исключение - throw new RuntimeException.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.2
 * @since 07.01.2020
 */
public class Fact {

    public static void main(String[] args) {
        System.out.println("Factorial number 100 -> " + cal(5));
    }

    /**
     * Вычисление факториала.
     *
     * @param n значение для которого вычисляется факториал.
     * @return факториал числа.
     */
    public static int cal(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Argument error (argument < 0)");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
