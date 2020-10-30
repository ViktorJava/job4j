package ru.job4j.loop;

/**
 * Найти степень числа.
 * Дано целое число a и целое число degree (> 0).
 * Найти a в степени degree: a^degree = a·a· . . . ·a
 * (числа a перемножаются degree раз).
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 30.10.2020
 */
public class DegreeLoop {
    /**
     * Метод возведения числа, а в степень b.
     *
     * @param a Число.
     * @param b Показатель степени.
     * @return Результат.
     */
    public static int calculate(int a, int b) {
        int result = a;
        for (int i = 1; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
