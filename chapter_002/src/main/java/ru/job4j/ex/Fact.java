package ru.job4j.ex;

/**
 * Класс вычисления факториала.
 * Кидаем исключение - throw new RuntimeException.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 07.01.2020
 */
public class Fact {
    public static void main(String[] args) {
        System.out.println("Factorial number 100 -> " + new Fact().cal(100));
    }

    /**
     * Вычисление факториала.
     *
     * @param n значение для которого расчитывается факториал.
     * @return факториал числа.
     */
    public int cal(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Argument error (argument < 1)");
        }
        int result = 1;
        for (int index = 1; index != n; index++) {
            result += index;
        }
        return result;
    }
}