package ru.job4j.loop;

/**
 * ТЗ [#173365]: 5.6. Простые числа.
 * нужно посчитать количество простых чисел от 1 до x.
 * Простое число считается, число которое делится только на себя и на единицу.
 * число 1 не является простым числом.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.2
 * @since 03.09.2019
 */
public class PrimeNumber {

    /**
     * Метод calc(int finish) считает кол-во простых чисел в диапазоне
     * от 2 до finish (число 1 не является простым)
     *
     * @param finish число указывает ширину диапазона расчёта простых чисел
     * @return int кол-во простых чисел
     */
    public int calc(int finish) {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();

        int count = 0;
        for (int i = 2; i <= finish; i++) {
            if (checkPrimeNumber.check(i)) {
                count++;
            }
        }
        return count;
    }
}
