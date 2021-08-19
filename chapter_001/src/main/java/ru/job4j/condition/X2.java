package ru.job4j.condition;

/**
 * Входные данные в тесте [#297750]
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 8/19/2021
 */
public class X2 {
    /**
     * Вычисление функции квадратного трехчлена.
     *
     * @param a Коэффициент выражения.
     * @param b Коэффициент выражения.
     * @param c Коэффициент выражения.
     * @param x Переменная величина.
     * @return Результат.
     */
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 1;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
    }
}
