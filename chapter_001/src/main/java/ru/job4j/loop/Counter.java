package ru.job4j.loop;

/**
 * TЗ [#173359]:Подсчет суммы чётных чисел в диапазоне
 *
 * @author Created by ViktorJava on 31.08.2019 (gipsyscrew@gmail.com)
 * @version 0.0.2
 */

public class Counter {

    /**
     * Метод add возвращает сумму чётных чисел,
     * из чисел,в диапазоне от start до finish
     *
     * @param start  начало диапазона
     * @param finish конец диапазона
     * @return сумма чётных чисел
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
