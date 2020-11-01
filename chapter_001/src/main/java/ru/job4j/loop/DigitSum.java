package ru.job4j.loop;

/**
 * Сумма цифр.
 * Дано число, нужно получить сумму его цифр.
 * Например:  12 => 1 + 2 => 3
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 31.10.2020
 */
public class DigitSum {
    /**
     * Метод расчёта суммы цифр.
     *
     * @param num Число.
     * @return Сумма цифр.
     */
    public static int sum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
