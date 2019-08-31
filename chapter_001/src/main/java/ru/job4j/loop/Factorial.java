package ru.job4j.loop;

/**
 * TЗ [#173360]: 5.2. Создать программу, вычисляющую факториал.
 *
 * @author Created by ViktorJava on 31.08.2019 (gipsyscrew@gmail.com)
 * @version 0.0.1
 */
public class Factorial {

    /**
     * Метод calc() должен возвращать факториал числа n
     *
     * @param n начало диапазона
     * @return факториал числа n
     */
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
