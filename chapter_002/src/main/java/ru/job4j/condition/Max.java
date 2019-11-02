package ru.job4j.condition;

/**
 * ТЗ [#173486]:Перегрузить метод max для 2,3 и 4 чисел.
 * Поиск максимального числа
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 02.11.2019
 */
public class Max {
    /**
     * метод возвращает максимальное число из first и second.
     *
     * @param first  первое число
     * @param second второе число
     * @return максимальное из двух чисел.
     */
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    /**
     * метод возвращает максимальное число из first, second, third.
     *
     * @param first  первое число
     * @param second второе число
     * @param third  третее число
     * @return максимальное из двух чисел.
     */
    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    /**
     * метод возвращает максимальное число из first и second, third, fourth.
     *
     * @param first  первое число
     * @param second второе число
     * @param third  третее число
     * @param fourth четвёртое число
     * @return максимальное из двух чисел.
     */
    public static int max(int first, int second, int third, int fourth) {
        return max(max(first, second), max(third, fourth));
    }
}

