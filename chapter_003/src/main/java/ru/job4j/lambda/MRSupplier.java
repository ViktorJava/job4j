package ru.job4j.lambda;

import java.util.function.Supplier;

/**
 * Method reference и Supplier.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10.10.2020
 */
public class MRSupplier {
    /**
     * Метод возвращает Supplier, который создает пустую строку.
     *
     * @return Supplier с пустой строкой.
     */
    public static Supplier<String> supplier() {
        return String::new;
    }
}
