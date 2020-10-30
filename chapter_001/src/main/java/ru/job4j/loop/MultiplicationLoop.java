package ru.job4j.loop;

/**
 * Произведение чисел в диапазоне.
 * Даны два целых числа a и b (a < b).
 * Найти произведение всех целых чисел от a до b включительно.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 30.10.2020
 */
public class MultiplicationLoop {
    /**
     * Произведение чисел в диапазоне.
     *
     * @param a Нижняя граница диапазона.
     * @param b Верхняя граница диапазона.
     * @return Произведение.
     */
    public static int mult(int a, int b) {
        int result = a;
        for (int i = a; i <= b; i++) {
            result = result * i;
        }
        return result;
    }
}
