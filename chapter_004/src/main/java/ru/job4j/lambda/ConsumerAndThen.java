package ru.job4j.lambda;

import java.util.function.Consumer;

/**
 * Consumer. Вывод строки. Метод andThen().
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 06.10.2020
 */
public class ConsumerAndThen {
    /**
     * Вывод строки, полученной совмещением двух Consumer интерфейсов.
     * @param input Совмещаемая строка.
     * @return Совмещённая строка.
     */
    public static Consumer<String> consumer(String input) {
        Consumer<String> print = t -> System.out.print(input);
        Consumer<String> ln = t -> System.out.println();
        return print.andThen(ln);
    }
}
