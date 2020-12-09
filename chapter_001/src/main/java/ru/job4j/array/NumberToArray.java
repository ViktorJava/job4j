package ru.job4j.array;

/**
 * Массив цифр.
 * <p>
 * Дано число int. Нужно получить массив из его цифр в обратном порядке.
 * Например: 12345 => {5, 4, 3, 2, 1}
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 08.12.2020
 */
public class NumberToArray {
    /**
     * Метод возвращает массив чисел в обратном порядке.
     *
     * @param number Число.
     * @return Число в обратном порядке.
     */
    public static int[] resolve(int number) {
        int i = 0;
        int length = Integer.toString(number).length();
        int[] result = new int[length];
        while (number != 0) {
            result[i] = number % 10;
            number = number / 10;
            i++;
        }
        return result;
    }
}
