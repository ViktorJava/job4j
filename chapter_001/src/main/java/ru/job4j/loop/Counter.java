package ru.job4j.loop;

/**
 * Подсчет суммы чисел в диапазоне.
 *
 * @author Created by ViktorJava on 31.08.2019 (gipsyscrew@gmail.com)
 * @version 0.1.2
 */

public class Counter {

    /**
     * Метод подсчитывает сумму чисел от start до finish.
     *
     * @param start  Начало диапазона.
     * @param finish конец диапазона.
     * @return Сумма числе в диапазоне от start до finish.
     */
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }

    /**
     * Метод add возвращает сумму чётных чисел,
     * из чисел, в диапазоне от start до finish.
     *
     * @param start  Начало диапазона.
     * @param finish Конец диапазона.
     * @return Сумма чётных чисел.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if ((i % 2) == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
