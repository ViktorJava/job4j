package ru.job4j.calculator;

/**
 * Результат работы метода [#232622].
 * <p>
 * Методы и возвращаемое значение методов.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 8/18/2021
 */
@SuppressWarnings("UnnecessaryLocalVariable")
public class MathFunc {
    /**
     * Метод расчёта функции.
     *
     * @param x Независимое значение функции.
     * @return Зависимое значение функции.
     */
    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    /**
     * Метод расчёта функции.
     *
     * @param x независимое значение.
     * @return Зависимое значение функции.
     */
    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.func1(3);
        int result2 = MathFunc.func2(5);
        int result3 = MathFunc.func1(100);
        int total = result1 + result2;
        System.out.println(total);
    }
}
