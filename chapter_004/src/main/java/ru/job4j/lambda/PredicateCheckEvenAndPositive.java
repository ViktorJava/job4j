package ru.job4j.lambda;

import java.util.function.Predicate;

/**
 * Predicate. Проверить, что число четное и положительное.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 05.10.2020
 */
public class PredicateCheckEvenAndPositive {
    /**
     * Метод проверки числа на четность и положительность.
     *
     * @param num Проверяемое число.
     * @return Результат проверки.
     */
    public static boolean check(int num) {
        return check(n -> (num % 2 == 0) && (num > 0), num);
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
