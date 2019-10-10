package ru.job4j.loop;

/**
 * ТЗ [#173367]: 5.5. Простое число.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 02.09.2019
 */
public class CheckPrimeNumber {

    /**
     * Метод check(int finish) проверяет, что число является простым
     * (делится только на себя и на единицу)
     *
     * @param finish проверяемое число на простоту
     * @return true/false
     */
    public boolean check(int finish) {
        boolean result = true;
        if (finish < 2) {
            result = false;
        }
        for (int i = 2; i < finish; i++) {
            if (finish % i == 0) {
                result = false;
            }
        }
        return result;
    }
}
