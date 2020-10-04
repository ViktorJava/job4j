package ru.job4j.lambda;

import java.util.function.Predicate;

/**
 * Predicate. Проверить, что число положительное.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 05.10.2020
 */
public class PredicateCheckPositive {
    /**
     * Метод проверки числа на положительность.
     *
     * @param num Проверяемое число.
     * @return Результат проверки.
     */
    public static boolean check(int num) {
        return check(t -> num > 0, num);
    }

    /**
     * Метод с лямбдой как аргумент.
     *
     * @param predicate Лямбда проверки положительности числа.
     * @param num       Проверяемое число.
     * @return Результат проверки.
     */
    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
