package ru.job4j.loop;

/**
 * mod через while
 * Есть операция остаток от деления %.
 * Даны два целых положительных числа числа n и d (d > 0).
 * n это делимое, d это делитель.
 * Нужно не используя операцию %, найти остаток от деления.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 9/12/2021
 */
public class ModWithLoop {
    public static int mod(int n, int d) {
        while (n - d >= 0) {
            n = n - d;
        }
        return n;
    }
}
