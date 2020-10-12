package ru.job4j.lambda;

import java.util.function.Predicate;

/**
 * Method reference и Predicate.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 12.10.2020
 */
public class MRPredicate {
    /**
     * Метод проверки, что строка пустая.
     *
     * @return true в случае пустой строки, false в обратном случае.
     */
    public static Predicate<String> predicate() {
        return String::isEmpty;
    }
}
